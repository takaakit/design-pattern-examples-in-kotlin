package behavioralPatterns.visitor
// ˅

// ˄

abstract class FileSystemElement : Element {
    // ˅
    
    // ˄

    abstract val name: String
        // ˅
        
        // ˄

    abstract val size: Int
        // ˅
        
        // ˄

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
