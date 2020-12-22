package structuralPatterns.composite
// ˅
// ˄

class Directory(name: String) : FileSystemElement() {
    // ˅
    
    // ˄

    override val name: String = name
        // ˅
        
        // ˄

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

    private val elements: MutableList<FileSystemElement> = mutableListOf<FileSystemElement>()
        // ˅
        
        // ˄

    // Print this element with the "upperPath".
    override fun print(upperPath: String) {
        // ˅
        println("$upperPath/$this")
        for (element in elements) {
            element.print("$upperPath/$name")
        }
        // ˄
    }

    // Add a element
    fun add(element: FileSystemElement): FileSystemElement {
        // ˅
        elements.add(element)
        return this
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
