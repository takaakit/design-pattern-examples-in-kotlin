package structuralPatterns.composite
// ˅
// ˄

abstract class FileSystemElement {
    // ˅
    // ˄

    abstract val name: String
        // ˅
        
        // ˄

    abstract val size: Int
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
