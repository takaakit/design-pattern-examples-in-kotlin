package behavioralPatterns.interpreter
// ˅
// ˄

// A node corresponding to "repeat".
class Repeat : Node {
    // ˅
    // ˄

    private var number: Int = 0
        // ˅
        
        // ˄

    private var commandList: Node? = null
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        context.slideToken("repeat")
        number = context.number
        context.nextToken()
        commandList = CommandList()
        commandList?.parse(context)
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "repeat $number $commandList"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
