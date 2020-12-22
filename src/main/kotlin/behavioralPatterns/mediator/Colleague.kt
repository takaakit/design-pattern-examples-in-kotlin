package behavioralPatterns.mediator
// ˅
// ˄

interface Colleague {

    fun setMediator(mediator: Mediator?)

    // Set enable/disable from the Mediator
    fun setActivation(isEnable: Boolean)

    // ˅
    
    // ˄
}

// ˅

// ˄
