package structuralPatterns.proxy
// ˅
// ˄

class ProxyPrinter(name: String) : Printer {
    // ˅
    
    // ˄

    private var currentName: String = name
        // ˅
        
        // ˄

    // A printer that actually prints
    private var real: RealPrinter? = null
        // ˅
        
        // ˄

    override fun getName(): String {
        // ˅
        return currentName
        // ˄
    }

    override fun changeName(name: String) {
        // ˅
        if (real != null) {
            real!!.changeName(name)
        }
        currentName = name
        // ˄
    }

    override fun output(content: String) {
        // ˅
        if (real == null) {
            real = RealPrinter(currentName)
        }
        real!!.output(content)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
