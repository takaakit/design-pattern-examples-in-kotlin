package structuralPatterns.proxy
// ˅
// ˄

class RealPrinter(printerName: String) : Printer {
    // ˅
    init {
        heavyTask("Creating an instance($printerName) of the Printer")
    }
    // ˄

    var printerName: String = printerName
        // ˅
        
        // ˄

    // Display a content with the name
    override fun output(content: String) {
        // ˅
        println("==========")
        println(content)
        println("Printed by $printerName")
        println("==========")
        // ˄
    }

    // Heavy task (Please think so...)
    private fun heavyTask(message: String) {
        // ˅
        print(message)
        for (i in 0..9) {
            Thread.sleep(500)
            print(".")
        }
        println("Done.")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
