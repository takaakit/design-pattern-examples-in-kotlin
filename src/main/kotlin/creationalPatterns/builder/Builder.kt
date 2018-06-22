package creationalPatterns.builder
// ˅

// ˄

abstract class Builder {
    // ˅
    
    // ˄

    abstract fun createTitle(title: String)

    abstract fun createSection(section: String)

    abstract fun createItems(items: Array<String>)

    abstract fun close()

    // ˅
    
    // ˄
}

// ˅

// ˄
