package structuralPatterns.decorator
// ˅
// ˄

class FullFrame(display: Display) : Frame(display) {
    // ˅
    // ˄

    // Number of characters added left and right decoration characters
    override fun getColumns(): Int {
        // ˅
        return 1 + display.getColumns() + 1
        // ˄
    }

    // Number of rows added the upper and lower decoration lines
    override fun getRows(): Int {
        // ˅
        return 1 + display.getRows() + 1
        // ˄
    }

    override fun getLineText(row: Int): String {
        // ˅
        when (row) {
            0 ->
                return "+${createLine('-', display.getColumns())}+"   // Upper frame
            display.getRows() + 1 ->
                return "+${createLine('-', display.getColumns())}+"   // Bottom frame
            else ->
                return "|${display.getLineText(row - 1)}|"       // Other
        }
        // ˄
    }

    private fun createLine(ch: Char, size: Int): String {
        // ˅
        val builder = StringBuilder()
        for (i in 0 until size) {
            builder.append(ch)
        }
        return builder.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
