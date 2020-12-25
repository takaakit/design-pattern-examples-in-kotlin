package behavioralPatterns.strategy
// ˅

// ˄

class HandSignal(value: Int) {
    // ˅
    
    // ˄

    object Constant {
        // ˅
        
        // ˄

        // Rock
        const val ROCK: Int = 0
            // ˅
            
            // ˄

        // Scissors
        const val SCISSORS: Int = 1
            // ˅
            
            // ˄

        // Paper
        const val PAPER: Int = 2
            // ˅
            
            // ˄

        // Hands of rock-scissors-paper
        var handSignals: Array<HandSignal> = arrayOf(HandSignal(ROCK), HandSignal(SCISSORS), HandSignal(PAPER))
            // ˅
            
            // ˄

        // Characters of the hands
        val name: Array<String> = arrayOf("Rock", "Scissors", "Paper")
            // ˅
            
            // ˄

        // Get an instance of the hand
        fun getHand(handValue: Int): HandSignal {
            // ˅
            return handSignals[handValue]
            // ˄
        }

        // ˅
        
        // ˄
    }

    // Values of rock, scissors and paper.
    val value: Int = value
        // ˅
        
        // ˄

    // Return true if "this" is stronger than "hand".
    fun isStrongerThan(hand: HandSignal): Boolean {
        // ˅
        return judgeGame(hand) == 1
        // ˄
    }

    // Return false if "this" is weaker than "hand".
    fun isWeakerThan(hand: HandSignal): Boolean {
        // ˅
        return judgeGame(hand) == -1
        // ˄
    }

    override fun toString(): String {
        // ˅
        return Constant.name[value]
        // ˄
    }

    // The draw is 0. "this" win is 1. "hand" win is -1.
    private fun judgeGame(hand: HandSignal): Int {
        // ˅
        return if (this === hand) {
            0
        } else if ((value + 1) % 3 == hand.value) {
            1
        } else {
            -1
        }
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
