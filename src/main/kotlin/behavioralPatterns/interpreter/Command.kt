package behavioralPatterns.interpreter
// ˅
// ˄

class Command : Node {
    // ˅
    // ˄

    private var node: Node? = null
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        val aNode: Node
        when (context.currentToken) {
            "repeat" -> {
                aNode = Repeat()
                aNode.parse(context)
            }
            else -> {
                aNode = Action()
                aNode.parse(context)
            }
        }

        node = aNode    // Hold the parsed node
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
