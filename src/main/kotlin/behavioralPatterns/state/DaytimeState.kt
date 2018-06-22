package behavioralPatterns.state
// ˅

// ˄

object DaytimeState : State {
    // ˅
    
    // ˄

    // Set time
    override fun setTime(context: Context, hour: Int) {
        // ˅
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState)
        }
        // ˄
    }

    // Use a safe
    override fun useSafe(context: Context) {
        // ˅
        context.recordSecurityLog("Use a safe in the daytime")
        // ˄
    }

    // Sound a emergency bell
    override fun soundBell(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Sound a emergency bell in the daytime")
        // ˄
    }

    // Make a normal call
    override fun call(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Make a normal call in the daytime")
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "[Daytime]"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
