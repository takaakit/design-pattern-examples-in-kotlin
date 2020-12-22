package structuralPatterns.bridge
// ˅
// ˄

class TextDisplayImpl(text: String) : DisplayImpl {
    // ˅
    
    // ˄

    // A string to display
    private val text: String = text
        // ˅
        
        // ˄

    // A number of characters in bytes
    private val width: Int
        // ˅
        
        // ˄

    override fun implOpen() {
        // ˅
        printLine()
        // ˄
    }

    override fun implWrite() {
        // ˅
        println(":$text:") // Enclose a text with ":" and display it.
        // ˄
    }

    override fun implClose() {
        // ˅
        printLine()
        // ˄
    }

    private fun printLine() {
        // ˅
        print("*") // Display "*" mark at the beginning of a frame.
        for (i in 0 until width) {               // Display "." for the number of "width".
            print(".")
        }
        print("*\n") // Display "*" mark at the end of a frame.
        // ˄
    }

    // ˅
    init {
        width = text.length // Set the number of characters in bytes.
    }
    // ˄
}

// ˅

// ˄
