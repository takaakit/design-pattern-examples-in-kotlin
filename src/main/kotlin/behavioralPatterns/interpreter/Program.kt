package behavioralPatterns.interpreter
// ˅

// ˄

// A node corresponding to "program".
class Program : Node {
    // ˅
    
    // ˄

    private var commandList: Node? = null
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        context.slideToken("program")

        val aCommandList = CommandList()
        aCommandList.parse(context)

        this.commandList = aCommandList     // Hold the parsed command list
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "[program $commandList]"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
