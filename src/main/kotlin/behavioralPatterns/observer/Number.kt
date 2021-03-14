package behavioralPatterns.observer
// ˅
// ˄

// An abstract class that generates numbers.
abstract class Number {
    // ˅
    // ˄

    var value: Int = 0
        // ˅
        protected set
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

    fun removeObserver(observer: Observer) {
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
