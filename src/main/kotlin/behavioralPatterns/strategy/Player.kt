package behavioralPatterns.strategy
// ˅
// ˄

class Player(name: String, strategy: Strategy) {
    // ˅
    
    // ˄

    private val name: String = name
        // ˅
        
        // ˄

    private var winCount: Int = 0
        // ˅
        
        // ˄

    private var lossCount: Int = 0
        // ˅
        
        // ˄

    private var gameCount: Int = 0
        // ˅
        
        // ˄

    private val strategy: Strategy = strategy
        // ˅
        
        // ˄

    // Show a hand signal from the strategy.
    fun showHandSignal(): HandSignal {
        // ˅
        return strategy.showHandSignal()
        // ˄
    }

    // Notify a game result.
    fun notifyGameResult(result: GameResultType, ownHand: HandSignal, opponentsHand: HandSignal) {
        // ˅
        when (result) {
            GameResultType.Win -> {
                winCount++
                gameCount++
            }
            GameResultType.Loss -> {
                lossCount++
                gameCount++
            }
            GameResultType.Draw -> {
                gameCount++
            }
        }
        strategy.notifyGameResult(result, ownHand, opponentsHand)
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "$name [$gameCount games, $winCount won, $lossCount lost, ${gameCount - winCount - lossCount} drew]"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
