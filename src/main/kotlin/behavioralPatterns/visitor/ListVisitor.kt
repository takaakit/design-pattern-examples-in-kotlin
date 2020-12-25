package behavioralPatterns.visitor
// ˅
// ˄

class ListVisitor : Visitor {
    // ˅
    // ˄

    // Currently visited directory
    private var currentDirectory: String = ""
        // ˅
        
        // ˄

    // Visit a file
    override fun visit(file: File) {
        // ˅
        println("$currentDirectory/$file")
        // ˄
    }

    // Visit a directory
    override fun visit(directory: Directory) {
        // ˅
        println("$currentDirectory/$directory")
        val visitedDirectory = currentDirectory
        currentDirectory = currentDirectory + "/" + directory.name
        val it = directory.iterator()
        while (it.hasNext()) {
            val element = it.next()
            element.accept(this)
        }
        currentDirectory = visitedDirectory
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
