package behavioralPatterns.state
// ˅

// ˄

interface State {

    // Set time
    fun setTime(context: Context, hour: Int)

    // Use a safe
    fun useSafe(context: Context)

    // Sound a emergency bell
    fun soundBell(context: Context)

    // Make a normal call
    fun call(context: Context)

    // ˅
    
    // ˄
}

// ˅

// ˄
