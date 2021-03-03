package behavioralPatterns.mediator
// ˅
import javafx.event.EventHandler
import javafx.scene.control.TextField

// ˄

class ColleagueTextField(textField: TextField) : Colleague() {
    // ˅
    
    // ˄

    val isEmpty: Boolean
        // ˅
        get() = textField.text.isEmpty()
        // ˄

    val textField: TextField = textField
        // ˅
        
        // ˄

    // Set enable/disable from the Mediator
    override fun setActivation(isEnable: Boolean) {
        // ˅
        this.textField.isDisable = !isEnable
        // ˄
    }

    // ˅
    init {
        this.textField.onKeyReleased = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
