package behavioralPatterns.state
// ˅

// ˄

object DaytimeState : State {
    // ˅
    
    // ˄

    override fun setTime(context: Context, hour: Int) {
        // ˅
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState)
        }
        // ˄
    }

    override fun use(context: Context) {
        // ˅
        context.recordSecurityLog("Use a safe in the daytime")
        // ˄
    }

    override fun alarm(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Sound an emergency bell in the daytime")
        // ˄
    }

    override fun phone(context: Context) {
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
