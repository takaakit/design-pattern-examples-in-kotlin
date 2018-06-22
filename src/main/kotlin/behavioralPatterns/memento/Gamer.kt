package behavioralPatterns.memento
// ˅
import java.util.Random

// ˄

class Gamer(money: Int) {
    // ˅
    
    // ˄

    // Gamer's money
    var money: Int = money
        // ˅
        private set
        // ˄

    // Acquired desserts 
    private var desserts: MutableList<String> = mutableListOf()
        // ˅
        
        // ˄

    // Random number generator
    private val random: Random = Random()
        // ˅
        
        // ˄

    // Get a dessert
    private val dessert: String
        // ˅
        get() {
            var prefix = ""
            if (random.nextBoolean()) {
                prefix = "Delicious "
            }
            return prefix + dessertsName[random.nextInt(dessertsName.size)]
        }
        // ˄

    // Get current status
    fun createMemento(): Memento {
        // ˅
        val memento = Memento(money)
        val it = desserts.iterator()
        while (it.hasNext()) {
            val dessert = it.next() as String
            if (dessert.startsWith("Delicious ")) {         // Add a only delicious dessert
                memento.addDessert(dessert)
            }
        }
        return memento
        // ˄
    }

    // Undo status
    fun restoreMemento(memento: Memento) {
        // ˅
        this.money = memento.money
        this.desserts = memento.desserts
        // ˄
    }

    // Play a game
    fun play() {
        // ˅
        val dice = random.nextInt(6) + 1    // Shake a dice
        when (dice) {
            // In case of 1...Gamer's money increases
            1 -> {
                money += 100
                println("Gamer's money increases.")
            }
            // In case of 2...Gamer's money halves
            2 -> {
                money /= 2
                println("Gamer's money halves.")
            }
            // In case of 6...Gamer gets desserts
            6 -> {
                println("Gamer gets desserts($dessert)")
                desserts.add(dessert)
            }
            // Other...Nothing happens
            else -> {
                println("Nothing happens.")
            }
        }
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "[money = $money, desserts = $desserts]"
        // ˄
    }

    // ˅
    companion object {
        private val dessertsName = arrayOf("Cake", "Candy", "Cookie")   // Dessert name table
    }
    // ˄
}

// ˅

// ˄
