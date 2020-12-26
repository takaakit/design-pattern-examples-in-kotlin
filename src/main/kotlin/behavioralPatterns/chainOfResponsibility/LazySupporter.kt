package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class LazySupporter(name: String) : Supporter(name) {
    // ˅
    
    // ˄

    // No troubles are handled.
    override fun canHandle(trouble: Trouble): Boolean {
        // ˅
        return false
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
