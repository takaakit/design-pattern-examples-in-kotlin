package behavioralPatterns.interpreter
// ˅
import java.util.StringTokenizer

// ˄

// Analyze the syntax
class Context(text: String) {
    // ˅
    
    // ˄

    private val tokenizer: StringTokenizer
        // ˅
        
        // ˄

    private var currentToken: String? = null
        // ˅
        
        // ˄

    fun nextToken(): String? {
        // ˅
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken()
        }
        else {
            currentToken = null
        }
        return currentToken
        // ˄
    }

    fun getToken(): String? {
        // ˅
        return currentToken
        // ˄
    }

    fun slideToken(token: String?) {
        // ˅
        if (token != currentToken) {
            throw Exception("WARNING: $token is expected but $currentToken was found.")
        }
        nextToken()
        // ˄
    }

    fun getNumber(): Int {
        // ˅
        var number = 0
        try {
            number = Integer.parseInt(currentToken!!)
        }
        catch (e: NumberFormatException) {
            throw Exception("WARNING: $e")
        }

        return number
        // ˄
    }

    // ˅
    init {
        tokenizer = StringTokenizer(text)
        nextToken()
    }
    // ˄
}

// ˅

// ˄
