package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

class Trouble(id: Int) {
    // ˅
    
    // ˄

    // Trouble number
    val id: Int = id
        // ˅
        
        // ˄

    override fun toString(): String {
        // ˅
        return "[Trouble $id]"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
