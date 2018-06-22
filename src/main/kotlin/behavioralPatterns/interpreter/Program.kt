package behavioralPatterns.interpreter
// ˅

// ˄

// A node corresponding to "program".
class Program : Node() {
    // ˅
    
    // ˄

    private var commandList: Node? = null
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        context.slideToken("program")
        commandList = CommandList()
        commandList?.parse(context)
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
