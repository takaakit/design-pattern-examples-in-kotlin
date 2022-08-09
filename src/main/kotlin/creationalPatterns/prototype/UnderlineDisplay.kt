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
        println("\"$message\"")
        println(" ${underlineChar.toString().repeat(message.length)}")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
