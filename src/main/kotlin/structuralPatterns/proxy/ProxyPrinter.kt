package structuralPatterns.proxy
// ˅
// ˄

// ProxyPrinter forwards requests to RealPrinter when appropriate.
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
        if (real != null) {
            return real!!.getName()
        } else {
            return currentName
        }
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
        // Check to see if the the RealPrinter had been created, create it if necessary.
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
