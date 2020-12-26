package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class LimitedSupporter(name: String, limitId: Int) : Supporter(name) {
    // ˅
    
    // ˄

    private val limitId: Int = limitId
        // ˅
        
        // ˄

    // Troubles with an ID below the limit are handled.
    override fun canHandle(trouble: Trouble): Boolean {
        // ˅
        return trouble.id <= limitId
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
