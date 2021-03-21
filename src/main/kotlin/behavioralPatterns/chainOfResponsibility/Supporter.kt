package behavioralPatterns.chainOfResponsibility
// ˅

// ˄

abstract class Supporter(name: String) {
    // ˅
    
    // ˄

    // Supporter name
    private val name: String = name
        // ˅
        
        // ˄

    // Next supporter
    private var next: Supporter? = null
        // ˅

        // ˄

    // Trouble support
    // Troubles are sent around.
    fun support(trouble: Trouble) {
        // ˅
        if (canHandle(trouble)) {
            supported(trouble)
        } else if (next != null) {
            next?.support(trouble)
        } else {
            unsupported(trouble)
        }
        // ˄
    }

    // Set a next supporter.
    fun setNext(next: Supporter): Supporter {
        // ˅
        this.next = next
        return next
        // ˄
    }

    protected abstract fun canHandle(trouble: Trouble): Boolean

    // Trouble was supported.
    private fun supported(trouble: Trouble) {
        // ˅
        println("$trouble was handled by $name.")
        // ˄
    }

    // Trouble was unsupported.
    private fun unsupported(trouble: Trouble) {
        // ˅
        println("$trouble was not handled.")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
