package behavioralPatterns.observer
// ˅
import java.util.*

// ˄

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
