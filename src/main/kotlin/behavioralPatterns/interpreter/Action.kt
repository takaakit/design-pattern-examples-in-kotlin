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
        val currentToken = context.token
        if (currentToken != "forward" && currentToken != "right" && currentToken != "left") {
            throw Exception("$currentToken is unknown")
        }

        name = currentToken     // Hold the current token as this action name

        context.slideToken(currentToken)
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
