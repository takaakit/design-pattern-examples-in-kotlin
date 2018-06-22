package structuralPatterns.proxy
// ˅

// ˄

class RealPrinter(name: String) : Printer {
    // ˅
    init {
        heavyTask("Creating an instance($name) of the Printer")
    }
    // ˄

    var printerName: String = name
        // ˅
        
        // ˄

    // Display a content with the name
    override fun output(content: String) {
        // ˅
        println("=== $printerName ===")
        println(content)
        // ˄
    }

    // Heavy task (Please think so...)
    private fun heavyTask(message: String) {
        // ˅
        print(message)
        for (i in 0..10) {
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
