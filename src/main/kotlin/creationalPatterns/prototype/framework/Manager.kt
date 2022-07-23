package creationalPatterns.prototype.framework
// ˅
// ˄

class Manager {
    // ˅
    // ˄

    private val display: MutableMap<String, Display> = mutableMapOf()
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
        return d!!.clone()      // Create a new object by asking a concrete class to clone itself. Therefore, do not need to know the concrete Display class name.
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
