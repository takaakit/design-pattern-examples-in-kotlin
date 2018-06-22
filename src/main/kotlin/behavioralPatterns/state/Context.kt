package behavioralPatterns.state
// ˅

// ˄

interface Context {

    // Set time
    fun setTime(hour: Int)

    // Change state
    fun changeState(state: State)

    // Call a security guard room
    fun callSecurityGuardsRoom(msg: String)

    // Record security log
    fun recordSecurityLog(msg: String)

    // ˅
    
    // ˄
}

// ˅

// ˄
