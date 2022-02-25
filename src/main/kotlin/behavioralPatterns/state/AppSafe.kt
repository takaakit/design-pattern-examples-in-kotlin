package behavioralPatterns.state
// ˅
import javafx.application.Application
import javafx.application.Platform
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import javafx.stage.Stage
import kotlin.concurrent.thread
import kotlin.system.exitProcess

// ˄

// Safe security system that the security status changes with time.
class AppSafe : Application(), Context {
    // ˅
    
    // ˄

    // Current state
    private var state: State = DaytimeState
        // ˅
        
        // ˄

    // Current time
    private var textTime: TextField? = null
        // ˅
        
        // ˄

    // Display of security center
    private var textMessage: TextArea? = null
        // ˅
        
        // ˄

    override fun start(primaryStage: Stage) {
        // ˅
        textTime = TextField("")
        textTime!!.isEditable = false
        textMessage = TextArea("")
        textMessage!!.isEditable = false

        val buttonUse = Button("Use")
        buttonUse.onMouseClicked = EventHandler {
            pressedUseButton()
        }

        val buttonAlarm = Button("Alarm")
        buttonAlarm.onMouseClicked = EventHandler {
            pressedAlarmButton()
        }
        
        val buttonPhone = Button("Phone")
        buttonPhone.onMouseClicked = EventHandler {
            pressedPhoneButton()
        }

        val topPane = Pane(textTime)
        val centerScreen = Pane(textMessage)
        val bottomPane = HBox(buttonUse, buttonAlarm, buttonPhone)
        bottomPane.alignment = Pos.BOTTOM_CENTER
        val mainPane = VBox(topPane, centerScreen, bottomPane)

        val scene = Scene(mainPane)
        primaryStage.scene = scene
        primaryStage.title = "State Example"
        primaryStage.onCloseRequest = EventHandler {
            exitProcess(0)
        }

        // Show
        primaryStage.show()
        // ˄
    }

    // Set time
    override fun setTime(hour: Int) {
        // ˅
        Platform.runLater {     // Updating UI is run on the JavaFX Application thread using Platform.runLater.
            var currentTime = "Current Time : "
            currentTime += if (hour < 10) {
                "0$hour:00"
            } else {
                "$hour:00"
            }

            println(currentTime)
            textTime?.text = currentTime
        }

        state.setTime(this, hour)
        // ˄
    }

    // Change state
    override fun changeState(state: State) {
        // ˅
        println("The state changed from " + this.state + " to " + state + ".")
        this.state = state
        // ˄
    }

    // Call a security guard room
    override fun callSecurityGuardsRoom(msg: String) {
        // ˅
        textMessage?.appendText("call! $msg\n")
        // ˄
    }

    // Record security log
    override fun recordSecurityLog(msg: String) {
        // ˅
        textMessage?.appendText("record ... $msg\n")
        // ˄
    }

    private fun pressedUseButton() {
        // ˅
        state.use(this)
        // ˄
    }

    private fun pressedAlarmButton() {
        // ˅
        state.alarm(this)
        // ˄
    }

    private fun pressedPhoneButton() {
        // ˅
        state.phone(this)
        // ˄
    }

    // ˅
    init {
        thread {
            while (true) {
                for (hour in 0..23) {
                    setTime(hour) // Set the time
                    try {
                        Thread.sleep(1000)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }
    // ˄
}

// ˅

// ˄
