package behavioralPatterns.command
// ˅
import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.HBox
import javafx.scene.layout.StackPane
import javafx.stage.Stage

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
        val undoButton = Button("Undo")
        undoButton.onMousePressed = EventHandler { undo() }

        val clearButton = Button("Clear")
        clearButton.onMousePressed = EventHandler { clear() }

        // Create panes
        val hBox = HBox(undoButton, clearButton)
        val mainPane = StackPane(canvas, hBox)

        // Create a scene
        val scene = Scene(mainPane)
        scene.onMouseDragged = EventHandler { onDragged(it.sceneX, it.sceneY) }

        primaryStage.title = "Command Example"
        primaryStage.scene = scene
        primaryStage.onCloseRequest = EventHandler {
        	System.exit(0)
        }

        // Show
        primaryStage.show()
        // ˄
    }

    private fun onDragged(x: Double, y: Double) {
        // ˅
        val paintingCommand = PaintingCommand(canvas, x, y)
        history.add(paintingCommand)
        paintingCommand.execute()
        // ˄
    }

    private fun undo() {
        // ˅
        canvas.clear()
        history.undo()
        history.execute()
        // ˄
    }

    private fun clear() {
        // ˅
        canvas.clear()
        history.clear()
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
