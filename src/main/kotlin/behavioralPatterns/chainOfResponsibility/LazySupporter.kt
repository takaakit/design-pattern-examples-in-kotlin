package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class LazySupporter(name: String) : Supporter(name) {
    // ˅
    
    // ˄

    // No troubles are handled.
    override fun handle(trouble: Trouble): Boolean {
        // ˅
        return false
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
