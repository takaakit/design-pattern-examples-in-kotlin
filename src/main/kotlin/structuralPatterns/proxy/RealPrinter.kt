package structuralPatterns.proxy
// ˅
// ˄

class RealPrinter(name: String) : Printer {
    // ˅
    init {
        heavyTask("Creating an instance ($name) of the Printer")
    }
    // ˄

    private var name: String = name
        // ˅
        
        // ˄

    override fun getName(): String {
        // ˅
        return name
        // ˄
    }

    override fun changeName(name: String) {
        // ˅
        this.name = name
        // ˄
    }

    // Display a content with the name
    override fun output(content: String) {
        // ˅
        println("==========")
        println(content)
        println("Printed by $name")
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
