package behavioralPatterns.mediator
// ˅
import javafx.event.EventHandler
import javafx.scene.control.RadioButton

// ˄

class ColleagueRadioButton(radioButton: RadioButton) : Colleague() {
    // ˅

    // ˄

    val isSelected: Boolean
        // ˅
        get() = radioButton.isSelected
        // ˄

    val radioButton: RadioButton = radioButton
        // ˅
        
        // ˄

    // Set enable/disable from the Mediator
    override fun setActivation(isEnable: Boolean) {
        // ˅
        this.radioButton.isDisable = !isEnable
        // ˄
    }

    // ˅
    init {
        this.radioButton.onAction = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
