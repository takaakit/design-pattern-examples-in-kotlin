package behavioralPatterns.strategy
// ˅
import java.util.Random

// ˄

// When winning a game, show the same hand at the next time.
class StrategyA(randomSeed: Int) : Strategy {
    // ˅
    
    // ˄

    private val random: Random = Random(randomSeed.toLong())
        // ˅
        
        // ˄

    private var won: Boolean = false
        // ˅
        
        // ˄

    private var preHand: Hand = Hand.getHand(Hand.ROCK)
        // ˅
        
        // ˄

    override fun nextHand(): Hand {
        // ˅
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3))
        }
        return preHand
        // ˄
    }

    override fun learn(win: Boolean) {
        // ˅
        won = win
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
