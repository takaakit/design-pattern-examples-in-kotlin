package behavioralPatterns.mediator
// ˅
import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage

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
        radioGuest?.radioButton?.toggleGroup = toggleGroup
        radioLogin?.radioButton?.toggleGroup = toggleGroup

        // Set a initial state
        radioGuest?.radioButton?.isSelected = true
        textUsername?.setActivation(false)
        textPassword?.setActivation(false)
        buttonOk?.setActivation(true)
        buttonCancel?.setActivation(true)

        // Create panes
        val checkBoxPane = HBox(radioGuest?.radioButton, radioLogin?.radioButton)
        checkBoxPane.spacing = 5.0
        val textFieldPane = GridPane()
        textFieldPane.hgap = 5.0
        textFieldPane.vgap = 2.0
        textFieldPane.add(Label("Username:"), 0, 0)
        textFieldPane.add(textUsername?.textField, 1, 0)
        textFieldPane.add(Label("Password:"), 0, 1)
        textFieldPane.add(textPassword?.textField, 1, 1)
        val bottomPane = HBox(buttonOk?.button, buttonCancel?.button)
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
        radioGuest?.mediator = this
        radioLogin?.mediator = this
        textUsername?.mediator = this
        textPassword?.mediator = this
        buttonOk?.mediator = this
        buttonCancel?.mediator = this

        // Show
        primaryStage.show()
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
                if (textUsername?.isEmpty == false
                        && textPassword?.isEmpty == false) {
                    buttonOk?.setActivation(true)
                } else {
                    buttonOk?.setActivation(false)
                }
            }
        }
        // ˄
    }

    override fun createColleagues() {
        // ˅
        radioGuest = ColleagueRadioButton(RadioButton("Guest"))
        radioLogin = ColleagueRadioButton(RadioButton("Login"))
        textUsername = ColleagueTextField(TextField())
        textPassword = ColleagueTextField(PasswordField())
        buttonOk = ColleagueButton(Button("OK"))
        buttonCancel = ColleagueButton(Button("Cancel"))
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
