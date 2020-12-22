package structuralPatterns.composite
// ˅
// ˄

class File(name: String, size: Int) : FileSystemElement() {
    // ˅
    
    // ˄

    override val name: String = name
        // ˅
        
        // ˄

    override val size: Int = size
        // ˅
        
        // ˄

    // Print this element with the "upperPath".
    override fun print(upperPath: String) {
        // ˅
        println("$upperPath/$this")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
