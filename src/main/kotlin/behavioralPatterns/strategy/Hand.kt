package behavioralPatterns.strategy
// ˅

// ˄

class Hand(value: Int) {
    // ˅
    
    // ˄

    // Values of rock, scissors and paper.
    val value: Int = value
        // ˅

        // ˄

    // Return true if "this" is stronger than "hand".
    fun isStrongerThan(hand: Hand): Boolean {
        // ˅
        return judgeGame(hand) == 1
        // ˄
    }

    // Return false if "this" is weaker than "hand".
    fun isWeakerThan(hand: Hand): Boolean {
        // ˅
        return judgeGame(hand) == -1
        // ˄
    }

    override fun toString(): String {
        // ˅
        return name[value]
        // ˄
    }

    // The draw is 0. "this" win is 1. "hand" win is -1.
    private fun judgeGame(hand: Hand): Int {
        // ˅
        if (this == hand) {
            return 0
        }
        else if ((this.value + 1) % 3 == hand.value) {
            return 1
        }
        else {
            return -1
        }
        // ˄
    }

    // ˅
    companion object {
        const val ROCK: Int = 0              // Rock
        const val SCISSORS: Int = 1          // Scissors
        const val PAPER: Int = 2             // Paper

        // Hands of rock-scissors-paper
        private val hands = arrayOf(Hand(ROCK), Hand(SCISSORS), Hand(PAPER))

        // Characters of the hands
        private val name = arrayOf("Rock", "Scissors", "Paper")

        // Get an instance of the hand
        fun getHand(handValue: Int): Hand {
            return hands[handValue]
        }
    }
    // ˄
}

// ˅

// ˄
