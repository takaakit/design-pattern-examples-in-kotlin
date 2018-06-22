package structuralPatterns.decorator
// ˅

// ˄

class FullFrame(display: Display) : Frame(display) {
    // ˅
    
    // ˄

    // Number of characters added left and right decoration characters
    override val columns: Int
        // ˅
        get() = 1 + display.columns + 1
        // ˄

    // Number of rows added the upper and lower decoration lines
    override val rows: Int
        // ˅
        get() = 1 + display.rows + 1
        // ˄

    override fun getLineText(row: Int): String {
        // ˅
        when (row) {
            0 ->
                return "+${createLine('-', display.columns)}+"   // Upper frame
            display.rows + 1 ->
                return "+${createLine('-', display.columns)}+"   // Bottom frame
            else ->
                return "|${display.getLineText(row - 1)}|"       // Other
        }
        // ˄
    }

    private fun createLine(ch: Char, size: Int): String {
        // ˅
        val buf = StringBuffer()
        for (i in 0 until size) {
            buf.append(ch)
        }
        return buf.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
