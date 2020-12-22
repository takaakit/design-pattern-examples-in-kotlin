package behavioralPatterns.mediator
// ˅
import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.control.ToggleGroup
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage
import javafx.stage.WindowEvent

// ˄

class AppLogin : Application(), Mediator {
    // ˅
    // ˄

    private var radioLogin: ColleagueRadioButton? = null
        // ˅
        
        // ˄

    private var radioGuest: ColleagueRadioButton? = null
        // ˅
        
        // ˄

    private var textUsername: ColleagueTextField? = null
        // ˅
        
        // ˄

    private var textPassword: ColleagueTextField? = null
        // ˅
        
        // ˄

    private var buttonOk: ColleagueButton? = null
        // ˅
        
        // ˄

    private var buttonCancel: ColleagueButton? = null
        // ˅
        
        // ˄

    override fun start(primaryStage: Stage) {
        // ˅
        // Create TextField, Button and RadioButton
        createColleagues()
        val toggleGroup = ToggleGroup()
        radioGuest?.toggleGroup = toggleGroup
        radioLogin?.toggleGroup = toggleGroup

        // Set a initial state
        radioGuest?.isSelected = true
        textUsername?.setActivation(false)
        textPassword?.setActivation(false)
        buttonOk?.setActivation(true)
        buttonCancel?.setActivation(true)

        // Create panes
        val checkBoxPane = HBox(radioGuest, radioLogin)
        checkBoxPane.spacing = 5.0
        val textFieldPane = GridPane()
        textFieldPane.hgap = 5.0
        textFieldPane.vgap = 2.0
        textFieldPane.add(Label("Username:"), 0, 0)
        textFieldPane.add(textUsername, 1, 0)
        textFieldPane.add(Label("Password:"), 0, 1)
        textFieldPane.add(textPassword, 1, 1)
        val bottomPane = HBox(buttonOk, buttonCancel)
        bottomPane.spacing = 5.0
        bottomPane.alignment = Pos.CENTER_RIGHT
        val mainPane = VBox(checkBoxPane, textFieldPane, bottomPane)
        mainPane.spacing = 5.0
        mainPane.padding = Insets(5.0, 5.0, 5.0, 5.0)

        // Create a scene
        val scene = Scene(mainPane)
        primaryStage.scene = scene
        primaryStage.title = "Mediator Example"
        primaryStage.onCloseRequest = EventHandler {
            System.exit(0)
        }

        // Set mediators
        radioGuest?.setMediator(this)
        radioLogin?.setMediator(this)
        textUsername?.setMediator(this)
        textPassword?.setMediator(this)
        buttonOk?.setMediator(this)
        buttonCancel?.setMediator(this)

        // Show
        primaryStage.show()
        // ˄
    }

    override fun createColleagues() {
        // ˅
        radioGuest = ColleagueRadioButton("Guest")
        radioLogin = ColleagueRadioButton("Login")
        textUsername = ColleagueTextField("")
        textPassword = ColleagueTextField("")
        buttonOk = ColleagueButton("OK")
        buttonCancel = ColleagueButton("Cancel")
        // ˄
    }

    // Change enable/disable of the Colleagues when notified from the Mediators.
    override fun colleagueChanged() {
        // ˅
        if (buttonOk?.isPressed == true
                || buttonCancel?.isPressed == true) {
            System.exit(0)
        } else {
            if (radioGuest?.isSelected == true) {    // Guest mode
                textUsername?.setActivation(false)
                textPassword?.setActivation(false)
                buttonOk?.setActivation(true)
            } else {                                  // Login mode
                textUsername?.setActivation(true)
                textPassword?.setActivation(true)

                // Judge whether the changed Colleague is enabled or disabled
                if (textUsername?.text?.isEmpty() == false
                        && textPassword?.text?.isEmpty() == false) {
                    buttonOk?.setActivation(true)
                } else {
                    buttonOk?.setActivation(false)
                }
            }
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
