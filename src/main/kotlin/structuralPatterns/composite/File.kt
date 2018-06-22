package structuralPatterns.composite
// ˅

// ˄

class File(name: String, size: Int) : FileSystemElement() {
    // ˅
    
    // ˄

    protected override var name: String = name
        // ˅
        
        // ˄

    protected override var size: Int = size
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
