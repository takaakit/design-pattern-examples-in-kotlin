package structuralPatterns.adapter
// ˅

// ˄

open class MessageDisplay(message: String) {
    // ˅
    
    // ˄

    private val message: String = message
        // ˅
        
        // ˄

    fun displayWithHyphens() {
        // ˅
        println("-- $message --")
        // ˄
    }

    fun displayWithBrackets() {
        // ˅
        println("[[ $message ]]")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
