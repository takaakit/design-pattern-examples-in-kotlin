package behavioralPatterns.mediator
// ˅
import javafx.scene.control.TextField
import javafx.event.EventHandler

// ˄

class ColleagueTextField(text: String) : Colleague, TextField(text) {
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
        onKeyReleased = EventHandler {
            mediator?.colleagueChanged()
        }
    }
    // ˄
}

// ˅

// ˄
