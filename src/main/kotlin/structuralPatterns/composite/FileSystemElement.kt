package structuralPatterns.composite
// ˅

// ˄

abstract class FileSystemElement {
    // ˅
    
    // ˄

    protected abstract val name: String
        // ˅
        
        // ˄

    protected abstract val size: Int
        // ˅
        
        // ˄

    // Print this element with the "upperPath".
    abstract fun print(upperPath: String)

    override fun toString(): String {
        // ˅
        return "$name ($size)"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
