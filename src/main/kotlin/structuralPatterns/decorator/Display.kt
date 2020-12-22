package structuralPatterns.decorator
// ˅

// ˄

abstract class Display {
    // ˅
    
    // ˄

    abstract fun getLineText(row: Int): String

    // Column width
    abstract fun getColumns(): Int

    // Number of rows
    abstract fun getRows(): Int

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
