package behavioralPatterns.state
// ˅

// ˄

object NightState : State {
    // ˅
    
    // ˄

    override fun setTime(context: Context, hour: Int) {
        // ˅
        if (9 <= hour && hour < 17) {
            context.changeState(DaytimeState)
        }
        // ˄
    }

    override fun use(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Emergency: Use a safe at night!")
        // ˄
    }

    override fun alarm(context: Context) {
        // ˅
        context.callSecurityGuardsRoom("Sound an emergency bell at night")
        // ˄
    }

    override fun phone(context: Context) {
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
