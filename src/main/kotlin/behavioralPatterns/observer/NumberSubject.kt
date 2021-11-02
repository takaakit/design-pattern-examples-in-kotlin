package behavioralPatterns.observer
// ˅
import java.util.*

// ˄

// Holds a value and notifies observers when the value is set.
class NumberSubject : Subject() {
    // ˅
    // ˄

    var value: Int = 0
        // ˅
        get() = field
        set(value) {
            field = value
            notifyObservers()
        }
        // ˄

    // ˅
    
    // ˄
}

// ˅

// ˄
