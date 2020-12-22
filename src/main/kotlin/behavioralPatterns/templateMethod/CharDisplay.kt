package behavioralPatterns.templateMethod
// ˅
// ˄

class CharDisplay(charValue: Char) : AbstractDisplay() {
    // ˅
    
    // ˄

    private val charValue: Char = charValue
        // ˅
        
        // ˄

    override fun open() {
        // ˅
        print("<<") // Display "<<" in the start characters.
        // ˄
    }

    override fun write() {
        // ˅
        print(charValue) // Display the character.
        // ˄
    }

    override fun close() {
        // ˅
        println(">>") // Display ">>" in the end characters.
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
