package behavioralPatterns.observer
// ˅
// ˄

// Display values as a number.
class DigitObserver : Observer {
    // ˅
    // ˄

    override fun update(number: Number) {
        // ˅
        println("Digit    : ${number.value}")
        Thread.sleep(100)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
