package behavioralPatterns.interpreter
// ˅
// ˄

class CommandList : Node {
    // ˅
    // ˄

    private val nodes: MutableList<Node> = mutableListOf()
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        while (true) {
            if (context.currentToken == null) {
                throw Exception("Missing 'end'")
            } else if (context.currentToken == "end") {
                context.slideToken("end")
                break
            } else {
                val aNode: Node = Command()
                aNode.parse(context)

                nodes.add(aNode)     // Hold the parsed node
            }
        }
        // ˄
    }

    override fun toString(): String {
        // ˅
        return nodes.toString()
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
