package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class SpecialSupporter(name: String, targetId: Int) : Supporter(name) {
    // ˅
    
    // ˄

    private val targetId: Int = targetId
        // ˅
        
        // ˄

    // Troubles with the specific ID are handled.
    protected override fun canHandle(trouble: Trouble): Boolean {
        // ˅
        return trouble.id == targetId
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
