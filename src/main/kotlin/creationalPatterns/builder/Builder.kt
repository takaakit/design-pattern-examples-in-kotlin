package creationalPatterns.builder
// ˅
// ˄

interface Builder {

    fun createTitle(title: String)

    fun createSection(section: String)

    fun createItems(items: Array<String>)

    fun close()

    // ˅
    
    // ˄
}

// ˅

// ˄
