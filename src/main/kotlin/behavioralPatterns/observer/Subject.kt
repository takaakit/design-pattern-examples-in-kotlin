package behavioralPatterns.observer
// ˅
// ˄

// An abstract class that generates numbers.
open class Subject {
    // ˅
    // ˄

    private val observers: MutableList<Observer> = mutableListOf<Observer>()
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
