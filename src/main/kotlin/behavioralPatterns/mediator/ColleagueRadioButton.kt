package behavioralPatterns.mediator
// ˅
import javafx.scene.control.RadioButton
import javafx.event.EventHandler

// ˄

class ColleagueRadioButton(caption: String) : Colleague, RadioButton(caption) {
    // ˅
    
    // ˄

    override var mediator: Mediator? = null
        // ˅
        
        // ˄

    // Set enable/disable from the Mediator
    override fun setActivation(isEnable: Boolean) {
        // ˅
        isDisable = !isEnable
        // ˄
    }

    // ˅
    init {
        onAction = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
