package creationalPatterns.abstractFactory.factory
// ˅

// ˄

abstract class Item(name: String) {
    // ˅
    
    // ˄

    protected val name: String = name
        // ˅
        
        // ˄

    abstract fun toHTML(): String

    // ˅
    
    // ˄
}

// ˅

// ˄
