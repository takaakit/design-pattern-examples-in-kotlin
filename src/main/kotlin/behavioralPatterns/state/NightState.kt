package behavioralPatterns.state
// ˅

// ˄

object NightState : State {
    // ˅
    
    // ˄

    // Set time
    override fun setTime(context: Context, hour: Int) {
        // ˅
        if (9 <= hour && hour < 17) {
            context.changeState(DaytimeState)
        }
        // ˄
    }

    // Use a safe
    override fun useSafe(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Emergency: Use a safe at night！")
        // ˄
    }

    // Sound a emergency bell
    override fun soundBell(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Sound a emergency bell at night")
        // ˄
    }

    // Make a normal call
    override fun call(context: Context) {
        // ˅
        context.recordSecurityLog("Record a night call")
        // ˄
    }

    override fun toString(): String {
        // ˅
        return "[Night]"
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
