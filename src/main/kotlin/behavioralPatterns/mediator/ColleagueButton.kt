package behavioralPatterns.mediator
// ˅
import javafx.event.EventHandler
import javafx.scene.control.Button

// ˄

class ColleagueButton(button: Button) : Colleague() {
    // ˅
    // ˄

    val isPressed: Boolean
        // ˅
        get() = button.isPressed
        // ˄

    val button: Button = button
        // ˅
        
        // ˄

    // Set enable/disable from the Mediator
    override fun setActivation(isEnable: Boolean) {
        // ˅
        this.button.isDisable = !isEnable
        // ˄
    }

    // ˅
    init {
        this.button.onMousePressed = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
