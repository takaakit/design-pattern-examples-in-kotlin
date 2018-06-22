package behavioralPatterns.strategy
// ˅
import java.util.Random

// ˄

// Calculate a hand from the previous hand stochastically.
class StrategyB(randomSeed: Int) : Strategy {
    // ˅
    
    // ˄

    private val random: Random = Random(randomSeed.toLong())
        // ˅
        
        // ˄

    private val history: Array<IntArray> = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))
        // ˅
        
        // ˄

    private var preHand: Hand = Hand(Hand.ROCK)
        // ˅
        
        // ˄

    private var curHand: Hand = Hand(Hand.ROCK)
        // ˅
        
        // ˄

    override fun nextHand(): Hand {
        // ˅
        val randomHandValue = random.nextInt(getHistorySum(curHand.value))
        var handValue = 0
        if (randomHandValue < history[curHand.value][0]) {
            handValue = Hand.ROCK
        }
        else if (randomHandValue < history[curHand.value][0] + history[curHand.value][1]) {
            handValue = Hand.SCISSORS
        }
        else {
            handValue = Hand.PAPER
        }
        preHand = curHand
        curHand = Hand.getHand(handValue)
        return curHand
        // ˄
    }

    override fun learn(win: Boolean) {
        // ˅
        if (win) {
            history[preHand.value][curHand.value]++
        }
        else {
            history[preHand.value][(curHand.value + 1) % 3]++
            history[preHand.value][(curHand.value + 2) % 3]++
        }
        // ˄
    }

    private fun getHistorySum(handValue: Int): Int {
        // ˅
        var sum = 0
        for (i in 0..2) {
            sum += history[handValue][i]
        }
        return sum
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
