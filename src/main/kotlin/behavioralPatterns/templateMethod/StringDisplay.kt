package behavioralPatterns.templateMethod
// ˅
// ˄

class StringDisplay(stringValue: String) : AbstractDisplay() {
    // ˅
    
    // ˄

    private val stringValue: String = stringValue
        // ˅
        
        // ˄

    // String width
    private val width: Int = stringValue.length
        // ˅
        
        // ˄

    override fun open() {
        // ˅
        writeLine() // Write a line
        // ˄
    }

    override fun write() {
        // ˅
        println("|$stringValue|") // Display the character with "|"
        // ˄
    }

    override fun close() {
        // ˅
        writeLine() // Write a line
        // ˄
    }

    private fun writeLine() {
        // ˅
        print("+")                  // Display an end mark "+"
        print("-".repeat(width))    // Display a line "-"
        println("+")                // Display an end mark "+"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
