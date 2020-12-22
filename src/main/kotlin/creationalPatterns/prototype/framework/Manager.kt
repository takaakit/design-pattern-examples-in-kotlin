package creationalPatterns.prototype.framework
// ˅
// ˄

class Manager {
    // ˅
    // ˄

    private val display: MutableMap<String, Display> = mutableMapOf<String, Display>()
        // ˅
        
        // ˄

    fun registerDisplay(displayName: String, display: Display) {
        // ˅
        this.display[displayName] = display
        // ˄
    }

    fun getDisplay(displayName: String): Display {
        // ˅
        val d = display[displayName]
        return d!!.createClone()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
