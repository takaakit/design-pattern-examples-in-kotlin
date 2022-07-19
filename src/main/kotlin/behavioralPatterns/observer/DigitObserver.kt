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
        // Before processing, it checks to make sure the changed subject is the subject held.
        if (changedSubject === numberSubject) {
            println("Digit    : ${numberSubject.value}")
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
