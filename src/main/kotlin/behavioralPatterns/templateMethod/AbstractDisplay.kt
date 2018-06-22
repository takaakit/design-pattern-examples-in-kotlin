package behavioralPatterns.templateMethod
// ˅

// ˄

abstract class AbstractDisplay {
    // ˅
    
    // ˄

    abstract fun open()

    abstract fun write()

    abstract fun close()

    fun output() {
        // ˅
        open()
        for (i in 0..4) {       // Repeat write 5 times
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
