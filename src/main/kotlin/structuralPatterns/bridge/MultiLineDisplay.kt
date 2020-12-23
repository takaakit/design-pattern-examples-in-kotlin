package structuralPatterns.bridge
// ˅

// ˄

class MultiLineDisplay(impl: DisplayImpl) : Display(impl) {
    // ˅
    
    // ˄

    // Repeat display for the specified number of times
    fun outputMultiple(times: Int) {
        // ˅
        open()
        for (i in 0 until times) {
            write()
        }
        close()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
