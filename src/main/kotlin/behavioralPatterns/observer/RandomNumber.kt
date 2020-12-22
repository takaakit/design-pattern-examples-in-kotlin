package behavioralPatterns.observer
// ˅
import java.util.*

// ˄

// Generate a random number.
class RandomNumber : Number() {
    // ˅
    // ˄

    override var value: Int = 0
        // ˅
        private set
        // ˄

    private val random: Random = Random()
        // ˅
        
        // ˄

    override fun generate() {
        // ˅
        for (i in 0..19) {
            value = random.nextInt(50)
            notifyObservers()
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
