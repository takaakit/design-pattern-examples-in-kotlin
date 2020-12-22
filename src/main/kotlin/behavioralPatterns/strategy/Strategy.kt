package behavioralPatterns.strategy
// ˅

// ˄

interface Strategy {

    // Show a hand signal.
    fun showHandSignal(): HandSignal

    // Notify a game result.
    fun notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal)

    // ˅
    
    // ˄
}

// ˅

// ˄
