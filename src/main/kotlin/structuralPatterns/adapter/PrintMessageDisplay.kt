package structuralPatterns.adapter
// ˅

// ˄

class PrintMessageDisplay(message: String) : MessageDisplay(message), Print {
    // ˅
    
    // ˄

    override fun printWeak() {
        // ˅
        displayWithHyphens()
        // ˄
    }

    override fun printStrong() {
        // ˅
        displayWithBrackets()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
