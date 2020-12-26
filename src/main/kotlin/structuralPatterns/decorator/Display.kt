package structuralPatterns.decorator
// ˅

// ˄

abstract class Display {
    // ˅
    
    // ˄

    // Column width
    abstract fun getColumns(): Int

    // Number of rows
    abstract fun getRows(): Int

    abstract fun getLineText(row: Int): String

    // Show all
    fun show() {
        // ˅
        for (i in 0 until getRows()) {
            println(getLineText(i))
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
