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

    // Calculate a hand from the strategy.
    fun nextHand(): Hand {
        // ˅
        return strategy.nextHand()
        // ˄
    }

    // Won a game.
    fun won() {
        // ˅
        strategy.learn(true)
        winCount++
        gameCount++
        // ˄
    }

    // Lost a game.
    fun lost() {
        // ˅
        strategy.learn(false)
        lossCount++
        gameCount++
        // ˄
    }

    // Drew a game.
    fun drew() {
        // ˅
        gameCount++
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
