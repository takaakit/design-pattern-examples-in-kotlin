package creationalPatterns.builder
// ˅
// ˄

class PlainTextBuilder : Builder {
    // ˅
    // ˄

    // String to output
    val content: String
        // ˅
        get() = builder.toString()
        // ˄

    private val builder: StringBuilder = StringBuilder()
        // ˅
        
        // ˄

    // Make a title of plain text
    override fun createTitle(title: String) {
        // ˅
        builder.append("--------------------------------\n") // Decoration line
        builder.append("[$title]\n") // Title
        builder.append("\n") // Blank line
        // ˄
    }

    // Make a section of plain text
    override fun createSection(section: String) {
        // ˅
        builder.append("* $section\n") // Section
        builder.append("\n") // Blank line
        // ˄
    }

    // Make items of plain text
    override fun createItems(items: Array<String>) {
        // ˅
        for (item in items) {
            builder.append("  - $item\n") // Items
        }
        builder.append("\n") // Blank line
        // ˄
    }

    override fun close() {
        // ˅
        builder.append("--------------------------------\n") // Decoration line
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
