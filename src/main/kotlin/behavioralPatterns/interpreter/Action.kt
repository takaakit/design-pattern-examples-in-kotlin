package behavioralPatterns.interpreter
// ˅
// ˄

// A node corresponding to "forward", "left", and "right".
class Action : Node {
    // ˅
    // ˄

    private var name: String? = null
        // ˅
        
        // ˄

    override fun parse(context: Context) {
        // ˅
        name = context.token
        context.slideToken(name)
        if (name != "forward" && name != "right" && name != "left") {
            throw Exception("$name is unknown")
        }
        // ˄
    }

    override fun toString(): String {
        // ˅
        return name.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
