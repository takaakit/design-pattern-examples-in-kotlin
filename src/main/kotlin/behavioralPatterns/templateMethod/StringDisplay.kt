package behavioralPatterns.templateMethod
// ˅

// ˄

class StringDisplay(string: String) : AbstractDisplay() {
    // ˅
    
    // ˄

    private val string: String = string
        // ˅
        
        // ˄

    // String width
    private val width: Int = string.toByteArray().size
        // ˅
        
        // ˄

    override fun open() {
        // ˅
        writeLine()             // Write a line
        // ˄
    }

    override fun write() {
        // ˅
        println("|$string|")    // Display the character with "|"
        // ˄
    }

    override fun close() {
        // ˅
        writeLine()              // Write a line
        // ˄
    }

    private fun writeLine() {
        // ˅
        print("+")              // Display an end mark "+"
        for (i in 0 until width) {
            print("-")          // Display a line "-"
        }
        println("+")            // Display an end mark "+"
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
