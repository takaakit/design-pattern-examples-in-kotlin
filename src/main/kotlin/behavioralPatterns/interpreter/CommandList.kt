package behavioralPatterns.interpreter
// ˅
// ˄

class CommandList : Node {
    // ˅
    // ˄

    private val nodes: MutableList<Node> = mutableListOf<Node>()
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        while (true) {
            if (context.token == null) {
                throw Exception("Missing 'end'")
            } else if (context.token == "end") {
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
