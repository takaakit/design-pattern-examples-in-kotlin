package structuralPatterns.decorator
// ˅

// ˄

class MessageDisplay(message: String) : Display() {
    // ˅
    
    // ˄

    // Number of characters
    override val columns: Int
        // ˅
        get() = message.toByteArray().size
        // ˄

    // The number of rows is 1
    override val rows: Int
        // ˅
        get() = 1
        // ˄

    // Message to be displayed
    private val message: String = message
        // ˅
        
        // ˄

    override fun getLineText(row: Int): String? {
        // ˅
        when (row) {
            0 -> return message
            else -> return null
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
