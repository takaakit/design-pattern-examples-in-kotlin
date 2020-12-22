package behavioralPatterns.visitor
// ˅
// ˄

interface Visitor {

    fun visit(file: File)

    fun visit(directory: Directory)

    // ˅
    
    // ˄
}

// ˅

// ˄
