package behavioralPatterns.state
// ˅

// ˄

interface State {

    fun setTime(context: Context, hour: Int)

    fun use(context: Context)

    fun alarm(context: Context)

    fun phone(context: Context)

    override fun toString(): String

    // ˅
    
    // ˄
}

// ˅

// ˄
