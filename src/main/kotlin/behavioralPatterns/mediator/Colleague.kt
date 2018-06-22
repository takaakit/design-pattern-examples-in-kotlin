package behavioralPatterns.mediator
// ˅

// ˄

interface Colleague {

    var mediator: Mediator?
        // ˅

        // ˄

    // Set enable/disable from the Mediator
    fun setActivation(isEnable: Boolean)

    // ˅
    
    // ˄
}

// ˅

// ˄
