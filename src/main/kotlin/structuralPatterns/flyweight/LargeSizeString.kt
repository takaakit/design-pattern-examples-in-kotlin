package structuralPatterns.flyweight
// ˅
// ˄

class LargeSizeString(string: String) {
    // ˅
    // ˄

    private val largeSizeChars: MutableList<LargeSizeChar> = mutableListOf()
        // ˅
        
        // ˄

    fun display() {
        // ˅
        for (largeSizeChar in largeSizeChars) {
            largeSizeChar.display()
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
