package behavioralPatterns.mediator
// ˅
import javafx.event.EventHandler
import javafx.scene.control.TextField
import javafx.scene.input.KeyEvent

// ˄

class ColleagueTextField(text: String) : TextField(text), Colleague {
    // ˅
    // ˄

    private var mediator: Mediator? = null
        // ˅
        
        // ˄

    override fun setMediator(mediator: Mediator?) {
        // ˅
        this.mediator = mediator
        // ˄
    }

    // Set enable/disable from the Mediator
    override fun setActivation(isEnable: Boolean) {
        // ˅
        isDisable = !isEnable
        // ˄
    }

    // ˅
    init {
        onKeyReleased = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
