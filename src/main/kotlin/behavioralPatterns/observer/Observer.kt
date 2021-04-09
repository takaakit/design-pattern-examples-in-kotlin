package behavioralPatterns.observer
// ˅

// ˄

// Defines an updating interface for objects that should be notified of changes in a subject.
interface Observer {

    fun update(changedSubject: Subject)

    // ˅
    
    // ˄
}

// ˅

// ˄
