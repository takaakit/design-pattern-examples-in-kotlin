package structuralPatterns.flyweight
// ˅
// ˄

object LargeSizeCharFactory {
    // ˅
    
    // ˄

    private val poolChars: MutableMap<String, LargeSizeChar> = mutableMapOf<String, LargeSizeChar>()
        // ˅
        
        // ˄

    // Create an instance of the large size character.
    fun getLargeSizeChar(charName: Char): LargeSizeChar {
        // ˅
        var lsc = poolChars.get(charName.toString())
        if (lsc == null) {
            lsc = LargeSizeChar(charName) // Create an instance
            poolChars[charName.toString()] = lsc
        }
        return lsc
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
