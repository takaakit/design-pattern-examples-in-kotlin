package creationalPatterns.prototype
// ˅
import creationalPatterns.prototype.framework.Display

// ˄

class UnderlineDisplay(underlineChar: Char) : Display {
    // ˅
    
    // ˄

    private val underlineChar: Char = underlineChar
        // ˅
        
        // ˄

    override fun clone(): Display {
        // ˅
        return UnderlineDisplay(underlineChar)
        // ˄
    }

    override fun show(message: String) {
        // ˅
        val length = message.length
        println("\"$message\"")
        print(" ")
        for (i in 0 until length) {
            print(underlineChar)
        }
        println()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
