package behavioralPatterns.observer
// ˅
// ˄

// Provides an interface for attaching and detaching Observer objects.
open class Subject {
    // ˅
    // ˄

    private val observers: MutableList<Observer> = mutableListOf()
        // ˅
        
        // ˄

    fun attach(observer: Observer) {
        // ˅
        observers.add(observer)
        // ˄
    }

    fun detach(observer: Observer) {
        // ˅
        observers.remove(observer)
        // ˄
    }

    fun notifyObservers() {
        // ˅
        for (observer in observers) {
            observer.update(this)
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
