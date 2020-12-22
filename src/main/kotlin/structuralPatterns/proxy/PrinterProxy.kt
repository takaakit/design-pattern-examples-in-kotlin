package structuralPatterns.proxy
// ˅
// ˄

class PrinterProxy(currentName: String) : Printer {
    // ˅
    
    // ˄

    private var currentName: String = currentName
        // ˅
        
        // ˄

    var printerName: String
        // ˅
        get() = currentName
        set(value) {
            real?.printerName = value
            currentName = value
        }
        // ˄

    // A printer that actually prints
    private var real: RealPrinter? = null
        // ˅
        
        // ˄

    override fun output(content: String) {
        // ˅
        createPrinter()
        real?.output(content)
        // ˄
    }

    // Create an actual printer
    private fun createPrinter() {
        // ˅
        if (real == null) {
            real = RealPrinter(currentName)
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
