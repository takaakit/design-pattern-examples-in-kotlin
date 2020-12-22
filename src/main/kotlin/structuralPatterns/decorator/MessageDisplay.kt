package structuralPatterns.decorator
// ˅
// ˄

class MessageDisplay(message: String) : Display() {
    // ˅
    
    // ˄

    // Message to be displayed
    private val message: String = message
        // ˅
        
        // ˄

    // Number of characters
    override fun getColumns(): Int {
        // ˅
        return message.length
        // ˄
    }

    // The number of rows is 1
    override fun getRows(): Int {
        // ˅
        return 1
        // ˄
    }

    override fun getLineText(row: Int): String {
        // ˅
        return message
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
