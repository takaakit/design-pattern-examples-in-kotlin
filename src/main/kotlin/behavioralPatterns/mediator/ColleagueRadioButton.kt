package behavioralPatterns.mediator
// ˅
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.RadioButton

// ˄

class ColleagueRadioButton(caption: String) : RadioButton(caption), Colleague {
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
        onAction = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
