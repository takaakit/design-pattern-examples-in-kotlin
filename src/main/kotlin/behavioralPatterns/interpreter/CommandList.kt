package behavioralPatterns.interpreter
// ˅

// ˄

class CommandList : Node() {
    // ˅
    
    // ˄

    private val nodes: MutableList<Node> = mutableListOf<Node>()
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        while (true) {
            if (context.getToken() == null) {
                throw Exception("Missing 'end'")
            }
            else if (context.getToken() == "end") {
                context.slideToken("end")
                break
            }
            else {
                val commandNode = Command()
                commandNode.parse(context)
                nodes.add(commandNode)
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
