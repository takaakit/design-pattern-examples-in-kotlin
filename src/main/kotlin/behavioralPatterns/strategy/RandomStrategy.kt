package behavioralPatterns.strategy
// ˅
import java.util.*

// ˄

// Random Strategy: showing a random hand signal.
class RandomStrategy : Strategy {
    // ˅
    // ˄

    private val random: Random = Random()
        // ˅
        
        // ˄

    override fun showHandSignal(): HandSignal {
        // ˅
        return HandSignal.getHand(random.nextInt(3))
        // ˄
    }

    override fun notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal) {
        // ˅
        // Do nothing
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
