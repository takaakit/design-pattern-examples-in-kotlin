package behavioralPatterns.strategy
// ˅
import java.util.*

// ˄

class HandSignal(value: Int) {
    // ˅
    
    // ˄

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
        return name[value]
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
    companion object {
        // Rock
        const val ROCK = 0

        // Scissors
        const val SCISSORS = 1

        // Paper
        const val PAPER = 2

        // Hands of rock-scissors-paper
        private val handSignals = Arrays.asList(HandSignal(ROCK), HandSignal(SCISSORS), HandSignal(PAPER))

        // Characters of the hands
        private val name = Arrays.asList("Rock", "Scissors", "Paper")

        // Get an instance of the hand
        fun getHand(handValue: Int): HandSignal {
            return handSignals[handValue]
        }
    }
    // ˄
}

// ˅

// ˄
