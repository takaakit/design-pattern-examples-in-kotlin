package behavioralPatterns.mediator
// ˅
import javafx.event.EventHandler
import javafx.scene.control.Button

// ˄

class ColleagueButton(caption: String) : Colleague, Button(caption) {
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
        onMousePressed = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
