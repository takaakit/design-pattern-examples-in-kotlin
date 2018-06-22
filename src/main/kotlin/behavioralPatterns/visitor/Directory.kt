package behavioralPatterns.visitor
// ˅

// ˄

class Directory(name: String) : FileSystemElement() {
    // ˅
    
    // ˄

    // Directory name
    override val name: String = name
        // ˅
        
        // ˄

    override val size: Int
        // ˅
        get() {
            var size = 0
            for (element: FileSystemElement in elements) {
                size += element.size
            }
            return size
        }
        // ˄

    // Collection of elements
    private val elements: MutableList<FileSystemElement> = mutableListOf<FileSystemElement>()
        // ˅
        
        // ˄

    // Accept a visitor
    override fun accept(visitor: Visitor) {
        // ˅
        visitor.visit(this)
        // ˄
    }

    // Add an entry
    fun add(element: FileSystemElement): FileSystemElement {
        // ˅
        elements.add(element)
        return this
        // ˄
    }

    // Create a iterator
    fun iterator(): Iterator<FileSystemElement> {
        // ˅
        return elements.iterator()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
