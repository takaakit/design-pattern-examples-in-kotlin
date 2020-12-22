package behavioralPatterns.strategy
// ˅
import behavioralPatterns.strategy.HandSignal

// ˄

// Mirror Strategy: showing a hand signal from the previous opponent's hand signal.
class MirrorStrategy : Strategy {
    // ˅
    
    // ˄

    private var preOpponentsHand: HandSignal = HandSignal.getHand(HandSignal.ROCK)
        // ˅
        
        // ˄

    override fun showHandSignal(): HandSignal {
        // ˅
        return preOpponentsHand
        // ˄
    }

    override fun notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal) {
        // ˅
        preOpponentsHand = opponentsHand
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
