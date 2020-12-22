package structuralPatterns.bridge
// ˅
// ˄

open class Display(impl: DisplayImpl) {
    // ˅
    
    // ˄

    private val impl: DisplayImpl = impl
        // ˅
        
        // ˄

    fun output() {
        // ˅
        open()
        write()
        close()
        // ˄
    }

    protected fun open() {
        // ˅
        impl.implOpen()
        // ˄
    }

    protected fun write() {
        // ˅
        impl.implWrite()
        // ˄
    }

    protected fun close() {
        // ˅
        impl.implClose()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
