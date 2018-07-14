package behavioralPatterns.state
// ˅
import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.scene.control.TextArea
import javafx.scene.control.Button
import javafx.scene.layout.HBox
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.stage.Stage
import kotlin.concurrent.thread

// ˄

class AppSafe : Context, Application() {
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

    // Current state
    private var state: State = DaytimeState
        // ˅
        
        // ˄

    override fun start(primaryStage: Stage) {
        // ˅

        textTime = TextField("")
        textMessage = TextArea("")

        val buttonUse: Button = Button("Use a safe")
        buttonUse.onMouseClicked = EventHandler {
            state.useSafe(this)      // Safe use button pressed
        }

        val buttonAlarm: Button = Button("Sound an emergency bell")
        buttonAlarm.onMouseClicked = EventHandler {
            state.soundBell(this)   // Emergency bell button pressed
        }

        val buttonPhone: Button = Button("Make a call")
        buttonPhone.onMouseClicked = EventHandler {
            state.call(this)        // Normal call button pressed
        }

        val buttonExit: Button = Button("Exit")
        buttonExit.onMouseClicked = EventHandler {
            System.exit(0)          // Exit button pressed
        }

        val topPane: Pane = Pane(textTime)
        val centerScreen: Pane = Pane(textMessage)
        val bottomPane: HBox = HBox(buttonUse, buttonAlarm, buttonPhone, buttonExit)
        bottomPane.alignment = Pos.BOTTOM_CENTER
        val mainPane: VBox = VBox(topPane, centerScreen, bottomPane)

        val scene: Scene = Scene(mainPane)
        primaryStage.scene = scene
        primaryStage.title = "State Example"
        primaryStage.onCloseRequest = EventHandler {
            System.exit(0)
        }

        // Show
        primaryStage.show()
        // ˄
    }

    // Set time
    override fun setTime(hour: Int) {
        // ˅
        var clockstring = "Current Time : "
        if (hour < 10) {
            clockstring += "0${hour.toString()}:00"
        }
        else {
            clockstring += "${hour.toString()}:00"
        }
        println(clockstring)
        textTime?.text = clockstring
        state.setTime(this, hour)
        // ˄
    }

    // Change state
    override fun changeState(state: State) {
        // ˅
        println("The state changed from ${this.state.toString()} to $state.")
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

    // ˅
    init {
        thread {
            while (true) {
                for (hour in 0..23) {
                    setTime(hour)   // Set the time
                    Thread.sleep(1000)
                }
            }
        }
    }
    // ˄
}

// ˅

// ˄
