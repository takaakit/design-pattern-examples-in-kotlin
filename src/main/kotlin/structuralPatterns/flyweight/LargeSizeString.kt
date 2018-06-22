package structuralPatterns.flyweight
// ˅

// ˄

class LargeSizeString(string: String) {
    // ˅
    
    // ˄

    private val largeSizeChars: MutableList<LargeSizeChar> = mutableListOf<LargeSizeChar>()
        // ˅
        
        // ˄

    fun display() {
        // ˅
        for (i in largeSizeChars.indices) {
            largeSizeChars[i].display()
        }
        // ˄
    }

    // ˅
    init {
        string.forEach {
            largeSizeChars.add(LargeSizeCharFactory.getLargeSizeChar(it))
        }
    }
    // ˄
}

// ˅

// ˄
