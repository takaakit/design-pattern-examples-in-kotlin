package behavioralPatterns.visitor
// ˅

// ˄

class File(name: String, size: Int) : FileSystemElement() {
    // ˅
    
    // ˄

    // File name
    override val name: String = name
        // ˅
        
        // ˄

    override val size: Int = size
        // ˅
        
        // ˄

    override fun accept(visitor: Visitor) {
        // ˅
        visitor.visit(this)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
