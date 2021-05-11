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

    // Directory size
    override val size: Int
        // ˅
        get() {
            var size = 0
            for (element in elements) {
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

    // Add an element
    fun add(element: FileSystemElement) {
        // ˅
        elements.add(element)
        // ˄
    }

    // Get the iterator
    operator fun iterator(): Iterator<FileSystemElement> {
        // ˅
        return elements.iterator()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
