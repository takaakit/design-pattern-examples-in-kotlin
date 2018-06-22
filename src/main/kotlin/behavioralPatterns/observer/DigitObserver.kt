package behavioralPatterns.observer
// ˅

// ˄

// Display values with digits.
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
