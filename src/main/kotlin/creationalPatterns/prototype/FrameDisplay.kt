package creationalPatterns.prototype
// ˅
import creationalPatterns.prototype.framework.Display

// ˄

class FrameDisplay(borderChar: Char) : Display {
    // ˅
    
    // ˄

    private val borderChar: Char = borderChar
        // ˅
        
        // ˄

    override fun clone(): Display {
        // ˅
        return FrameDisplay(borderChar)
        // ˄
    }

    override fun show(message: String) {
        // ˅
        println(borderChar.toString().repeat(message.length + 4))
        println("$borderChar $message $borderChar")
        println(borderChar.toString().repeat(message.length + 4))
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
