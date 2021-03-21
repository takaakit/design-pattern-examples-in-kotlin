package behavioralPatterns.observer
// ˅
// ˄

// Display values as a number.
class DigitObserver(numberSubject: NumberSubject) : Observer {
    // ˅
    // ˄

    private var numberSubject: NumberSubject = numberSubject
        // ˅
        
        // ˄

    override fun update(changedSubject: Subject) {
        // ˅
        if (changedSubject.equals(numberSubject)) {
            println("Digit    : ${numberSubject.value}")
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
