package behavioralPatterns.command
// ˅
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.layout.HBox
import javafx.event.EventHandler

// ˄

class AppMain : Application() {
    // ˅
    
    // ˄

    // Painting history
    private val history: HistoryCommand = HistoryCommand()
        // ˅
        
        // ˄

    private val canvas: PaintingCanvas = PaintingCanvas(400.0, 300.0)
        // ˅
        
        // ˄

    override fun start(primaryStage: Stage) {
        // ˅
        // Create buttons
        val clearButton = Button("clear")
        clearButton.onMousePressed = EventHandler {
            canvas.clear()
            history.clear()
        }
        val undoButton = Button("undo")
        undoButton.onMousePressed = EventHandler {
            canvas.clear()
            history.undo()
            history.execute()
        }

        // Create panes
        val hBox = HBox(undoButton, clearButton)
        val mainPane = StackPane(canvas, hBox)

        // Create a scene
        val scene = Scene(mainPane)
        scene.onMouseDragged = EventHandler {
            val paintingCommand = PaintingCommand(canvas, it.sceneX, it.sceneY)
            history.add(paintingCommand)
            paintingCommand.execute()
        }

        primaryStage.title = "Command Example"
        primaryStage.scene = scene
        primaryStage.onCloseRequest = EventHandler {
        	System.exit(0)
        }

        // Show
        primaryStage.show()
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
