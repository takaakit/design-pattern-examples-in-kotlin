package structuralPatterns.composite
// ˅

// ˄

class Directory(name: String) : FileSystemElement() {
    // ˅
    
    // ˄

    protected override var name: String = name
        // ˅
        
        // ˄

    protected override var size: Int = 0
        // ˅
        
        // ˄

    private val elements: MutableList<FileSystemElement> = mutableListOf<FileSystemElement>()
        // ˅
        
        // ˄

    // Print this element with the "upperPath".
    override fun print(upperPath: String) {
        // ˅
        println(upperPath + "/" + this)
        for (element: FileSystemElement in elements) {
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
