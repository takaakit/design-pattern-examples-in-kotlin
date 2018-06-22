package creationalPatterns.builder
// ˅

// ˄

class PlainTextBuilder : Builder() {
    // ˅
    
    // ˄

    // String to output
    val result: String
        // ˅
        get() = buffer.toString()
        // ˄

    private var buffer: StringBuffer = StringBuffer()
        // ˅
        
        // ˄

    // Make a title of plain text
    override fun createTitle(title: String) {
        // ˅
        buffer.append("--------------------------------\n")     // Decoration line
        buffer.append("[$title]\n")                             // Title
        buffer.append("\n")                                     // Blank line
        // ˄
    }

    // Make a section of plain text
    override fun createSection(section: String) {
        // ˅
        buffer.append("* $section\n")                           // Section
        buffer.append("\n")                                     // Blank line
        // ˄
    }

    // Make items of plain text
    override fun createItems(items: Array<String>) {
        // ˅
        for (i in items.indices) {
            buffer.append("  - ${items[i]}\n")                  // Items
        }
        buffer.append("\n")                                     // Blank line
        // ˄
    }

    override fun close() {
        // ˅
        buffer.append("--------------------------------\n")     // Decoration line
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
