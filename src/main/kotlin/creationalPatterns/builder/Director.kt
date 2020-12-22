package creationalPatterns.builder
// ˅
// ˄

class Director(builder: Builder) {
    // ˅
    
    // ˄

    private val builder: Builder = builder
        // ˅
        
        // ˄

    // Construct a document
    fun build() {
        // ˅
        builder.createTitle("Greeting") // Title
        builder.createSection("Morning and Afternoon") // Section
        builder.createItems(arrayOf("Good morning.", "Hello.")) // Items
        builder.createSection("Evening") // Other section
        builder.createItems(arrayOf("Good evening.", "Good night.", "Goodbye.")) // Other items
        builder.close()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
