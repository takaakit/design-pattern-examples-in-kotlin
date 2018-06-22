package creationalPatterns.prototype
// ˅
import creationalPatterns.prototype.framework.*

// ˄

class FrameDisplay(borderChar: Char) : Display {
    // ˅
    
    // ˄

    private val borderChar: Char = borderChar
        // ˅
        
        // ˄

    override fun createClone(): Display {
        // ˅
        return FrameDisplay(this.borderChar)
        // ˄
    }

    override fun show(message: String) {
        // ˅
        val length = message.toByteArray().size
        for (i in 0 until length + 4) {
            print(borderChar)
        }
        println("")
        println("$borderChar $message $borderChar")
        for (i in 0 until length + 4) {
            print(borderChar)
        }
        println("")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
