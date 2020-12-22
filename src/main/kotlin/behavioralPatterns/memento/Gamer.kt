package behavioralPatterns.memento
// ˅
import java.util.*

// ˄

class Gamer(money: Int) {
    // ˅
    
    // ˄

    // Gamer's money
    var money: Int = money
        // ˅
        
        // ˄

    // Random number generator
    private val random: Random = Random()
        // ˅
        
        // ˄

    // Get current status
    fun createMemento(): Memento {
        // ˅
        return Memento(money)
        // ˄
    }

    // Undo status
    fun restoreMemento(memento: Memento) {
        // ˅
        money = memento.money
        // ˄
    }

    // Play a game
    fun play() {
        // ˅
        val dice = random.nextInt(6) + 1 // Shake a dice
        println("The number of dice is $dice.")
        val preMoney = money
        when (dice) {
            1, 3, 5 -> {
                // In case of odd...Money is halved
                money /= 2
                println("Gamer's money is halved: $preMoney -> $money")
            }
            2, 4, 6 -> {
                // In case of even...Money doubles
                money *= 2
                println("Gamer's money doubles: $preMoney -> $money")
            }
            else -> {
                // Other...Exit
                System.err.println("Unexpected value.")
                System.exit(-1)
            }
        }
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "[money = $money]"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
