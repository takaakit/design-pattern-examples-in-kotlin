package behavioralPatterns.mediator
// ˅

// ˄

abstract class Colleague protected constructor() {
    // ˅
    
    // ˄

    var mediator: Mediator? = null
        // ˅
        
        // ˄

    // Set enable/disable from the Mediator
    abstract fun setActivation(isEnable: Boolean)

    // ˅
    
    // ˄
}

// ˅

// ˄
