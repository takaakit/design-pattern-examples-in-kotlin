package behavioralPatterns.mediator
// ˅
import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.scene.control.Label
import javafx.scene.control.ToggleGroup
import javafx.event.EventHandler

// ˄

class AppLogin : Mediator, Application() {
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

        val groupt: ToggleGroup = ToggleGroup()
        radioGuest?.setToggleGroup(groupt)
        radioLogin?.setToggleGroup(groupt)

        // Set a initial state
        radioGuest?.setSelected(true)
        textUsername?.setActivation(false)
        textPassword?.setActivation(false)
        buttonOk?.setActivation(false)
        buttonCancel?.setActivation(true)

        // Create panes
        val checkBoxPane: HBox = HBox(radioGuest, radioLogin)
        checkBoxPane.spacing = 5.0

        val textFieldPane: GridPane = GridPane()
        textFieldPane.hgap = 5.0
        textFieldPane.vgap = 2.0
        textFieldPane.add(Label("Username:"), 0, 0)
        textFieldPane.add(textUsername, 1, 0)
        textFieldPane.add(Label("Password:"), 0, 1)
        textFieldPane.add(textPassword, 1, 1)

        val bottomPane: HBox = HBox(buttonOk, buttonCancel)
        bottomPane.spacing = 5.0
        bottomPane.alignment = Pos.CENTER_RIGHT

        val mainPane: VBox = VBox(checkBoxPane, textFieldPane, bottomPane)
        mainPane.spacing = 5.0
        mainPane.padding = Insets(5.0, 5.0, 5.0, 5.0)

        // Create a scene
        val scene: Scene = Scene(mainPane)
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
        if (buttonOk?.isPressed == true ?: false
                || buttonCancel?.isPressed == true ?: false) {
            System.exit(0)
        }
        else {
            if (radioGuest?.isSelected == true) {    // Guest mode
                textUsername?.setActivation(false)
                textPassword?.setActivation(false)
                buttonOk?.setActivation(true)
            }
            else {                                  // Login mode
                textUsername?.setActivation(true)
                textPassword?.setActivation(true)

                // Judge whether the changed Colleage is enabled or disabled
                if (textUsername?.getText() != "" ?: false
                        && textPassword?.getText() != "" ?: false) {
                    buttonOk?.setActivation(true)
                }
                else {
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
