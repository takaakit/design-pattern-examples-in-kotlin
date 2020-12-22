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

    override fun createClone(): Display {
        // ˅
        return FrameDisplay(borderChar)
        // ˄
    }

    override fun show(message: String) {
        // ˅
        val length = message.length
        for (i in 0 until length + 4) {
            print(borderChar)
        }
        println()
        println("$borderChar $message $borderChar")
        for (i in 0 until length + 4) {
            print(borderChar)
        }
        println()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
