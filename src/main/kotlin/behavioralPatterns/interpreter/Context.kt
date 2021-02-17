package behavioralPatterns.interpreter
// ˅
import java.util.*
// ˄

// Hold the data which will be interpreted.
class Context(line: String) {
    // ˅
    // ˄

    private val tokenizer: StringTokenizer = StringTokenizer(line)
        // ˅
        // ˄

    var token: String? = null
        // ˅
        private set
        // ˄

    val number: Int
        // ˅
        get() {
            val number: Int = try {
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
        nextToken()
    }
    // ˄
}

// ˅

// ˄
