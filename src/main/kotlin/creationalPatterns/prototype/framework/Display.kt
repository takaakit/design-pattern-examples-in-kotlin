package creationalPatterns.prototype.framework
// ˅

// ˄

interface Display : Cloneable {

    fun createClone(): Display

    fun show(message: String)

    // ˅
    
    // ˄
}

// ˅

// ˄
