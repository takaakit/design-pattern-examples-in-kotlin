package structuralPatterns.decorator
// ˅

// ˄

abstract class Display {
    // ˅
    
    // ˄

    // Column width
    abstract val columns: Int
        // ˅
        
        // ˄

    // Number of rows
    abstract val rows: Int
        // ˅
        
        // ˄

    abstract fun getLineText(row: Int): String?

    // Show all
    fun show() {
        // ˅
        for (i in 0 until rows) {
            println(getLineText(i))
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
