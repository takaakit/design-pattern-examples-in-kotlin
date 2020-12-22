package behavioralPatterns.interpreter
// ˅
import java.util.*
// ˄

// Analyze the syntax
class Context(text: String) {
    // ˅
    // ˄

    private val tokenizer: StringTokenizer
        // ˅
        // ˄

    var token: String? = null
        // ˅
        private set
        // ˄

    val number: Int
        // ˅
        get() {
            val number: Int
            number = try {
                token!!.toInt()
            } catch (e: NumberFormatException) {
                throw Exception("WARNING: $e")
            }
            return number
        }
        // ˄

    fun nextToken(): String? {
        // ˅
        if (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken()
        } else {
            token = null
        }
        return token
        // ˄
    }

    fun slideToken(token: String?) {
        // ˅
        if (token != this.token) {
            throw Exception("WARNING: " + token + " is expected but " + this.token + " was found.")
        }
        nextToken()
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
