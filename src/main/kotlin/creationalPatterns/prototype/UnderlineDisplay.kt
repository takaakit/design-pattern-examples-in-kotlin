package creationalPatterns.prototype
// ˅
import creationalPatterns.prototype.framework.*

// ˄

class UnderlineDisplay(underlineChar: Char) : Display {
    // ˅
    
    // ˄

    private val underlineChar: Char = underlineChar
        // ˅
        
        // ˄

    override fun createClone(): Display {
        // ˅
        return UnderlineDisplay(this.underlineChar)
        // ˄
    }

    override fun show(message: String) {
        // ˅
        val length = message.toByteArray().size
        println("\"$message\"")
        print(" ")
        for (i in 0 until length) {
            print(underlineChar)
        }
        println("")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
