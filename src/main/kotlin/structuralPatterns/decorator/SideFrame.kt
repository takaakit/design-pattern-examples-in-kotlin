package structuralPatterns.decorator
// ˅
// ˄

class SideFrame(display: Display, frameChar: Char) : Frame(display) {
    // ˅
    
    // ˄

    // Decoration character
    private val frameChar: Char = frameChar
        // ˅
        
        // ˄

    // Number of characters added left and right decoration characters
    override fun getColumns(): Int {
        // ˅
        return 1 + display.getColumns() + 1
        // ˄
    }

    // Number of lines
    override fun getRows(): Int {
        // ˅
        return display.getRows()
        // ˄
    }

    override fun getLineText(row: Int): String {
        // ˅
        return frameChar.toString() + display.getLineText(row) + frameChar
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
