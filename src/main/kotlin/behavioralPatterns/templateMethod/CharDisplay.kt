package behavioralPatterns.templateMethod
// ˅

// ˄

class CharDisplay(char: Char) : AbstractDisplay() {
    // ˅
    
    // ˄

    private val char: Char = char
        // ˅
        
        // ˄

    override fun open() {
        // ˅
        print("<<")         // Display "<<" in the start characters.
        // ˄
    }

    override fun write() {
        // ˅
        print(char)         // Display the character.
        // ˄
    }

    override fun close() {
        // ˅
        println(">>")       // Display ">>" in the end characters.
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
