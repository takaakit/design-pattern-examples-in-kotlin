package behavioralPatterns.mediator
// ˅
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent

// ˄

class ColleagueButton(caption: String) : Button(caption), Colleague {
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
        onMousePressed = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
