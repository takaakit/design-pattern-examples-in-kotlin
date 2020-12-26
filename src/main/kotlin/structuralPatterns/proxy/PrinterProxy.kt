package structuralPatterns.proxy
// ˅
// ˄

class PrinterProxy(printerName: String) : Printer {
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

    private var currentName: String = printerName
        // ˅
        
        // ˄

    // A printer that actually prints
    private var real: RealPrinter? = null
        // ˅
        
        // ˄

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
