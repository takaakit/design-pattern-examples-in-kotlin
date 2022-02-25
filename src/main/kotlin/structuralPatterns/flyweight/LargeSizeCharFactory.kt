package structuralPatterns.flyweight
// ˅
// ˄

object LargeSizeCharFactory {
    // ˅
    
    // ˄

    private val poolChars: MutableMap<Char, LargeSizeChar> = mutableMapOf<Char, LargeSizeChar>()
        // ˅
        
        // ˄

    // Create an instance of the large size character.
    fun getLargeSizeChar(charName: Char): LargeSizeChar {
        // ˅
        var lsc = poolChars[charName]
        if (lsc == null) {
            lsc = LargeSizeChar(charName) // Create an instance
            poolChars[charName] = lsc
        }
        return lsc
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
