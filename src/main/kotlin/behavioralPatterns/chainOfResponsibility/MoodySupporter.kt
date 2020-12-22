package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class MoodySupporter(name: String) : Supporter(name) {
    // ˅
    
    // ˄

    // Troubles with an odd ID are handled.
    override fun handle(trouble: Trouble): Boolean {
        // ˅
        return trouble.id % 2 == 1
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
