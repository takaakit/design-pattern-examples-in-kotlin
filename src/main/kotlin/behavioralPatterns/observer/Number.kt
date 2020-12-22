package behavioralPatterns.observer
// ˅
// ˄

// An abstract class that generates numbers.
abstract class Number {
    // ˅
    // ˄

    abstract val value: Int
        // ˅
        
        // ˄

    private val observers: MutableList<Observer> = mutableListOf<Observer>()
        // ˅
        
        // ˄

    abstract fun generate()

    fun addObserver(observer: Observer) {
        // ˅
        observers.add(observer)
        // ˄
    }

    fun deleteObserver(observer: Observer) {
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
