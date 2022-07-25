package structuralPatterns.adapter
// ˅

// ˄

// Adapt the MessageDisplay interface to the Print interface.
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
