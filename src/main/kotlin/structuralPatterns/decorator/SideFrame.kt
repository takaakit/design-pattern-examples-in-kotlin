package structuralPatterns.decorator
// ˅

// ˄

class SideFrame(display: Display, frameChar: Char) : Frame(display) {
    // ˅
    
    // ˄

    // Number of characters added left and right decoration characters
    override val columns: Int
        // ˅
        get() = 1 + display.columns + 1
        // ˄

    // Number of lines
    override val rows: Int
        // ˅
        get() = display.rows
        // ˄

    // Decoration character
    private val frameChar: Char = frameChar
        // ˅
        
        // ˄

    override fun getLineText(row: Int): String? {
        // ˅
        return frameChar.toString() + display.getLineText(row) + frameChar.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
