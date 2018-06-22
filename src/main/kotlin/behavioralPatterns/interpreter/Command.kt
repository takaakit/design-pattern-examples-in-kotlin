package behavioralPatterns.interpreter
// ˅

// ˄

class Command : Node() {
    // ˅
    
    // ˄

    private var node: Node? = null
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        when (context.getToken()) {
            "repeat" -> {
                node = Repeat()
                node?.parse(context)
            }
            else -> {
                node = Action()
                node?.parse(context)
            }
        }
        // ˄
    }

    override fun toString(): String {
        // ˅
        return node.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
