package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class LazySupporter(name: String) : Supporter(name) {
    // ˅
    
    // ˄

    // No troubles are handled.
    protected override fun handle(trouble: Trouble): Boolean {
        // ˅
        return false
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
