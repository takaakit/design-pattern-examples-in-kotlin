package behavioralPatterns.command
// ˅
import javafx.scene.canvas.Canvas
import javafx.scene.paint.Color

// ˄

class PaintingCanvas(width: Double, height: Double, history: HistoryCommand) : PaintingTarget, Canvas() {
    // ˅

    // ˄

    private val paintingColor: Color = Color.LIGHTGREEN
        // ˅
        
        // ˄

    // Radius of the painting point
    private val pointRadius: Double = 6.0
        // ˅
        
        // ˄

    // Painting history
    private val history: HistoryCommand = history
        // ˅
        
        // ˄

    override fun paint(paintingPosX: Double, paintingPosY: Double) {
        // ˅
        graphicsContext2D.fill = paintingColor
        graphicsContext2D.fillOval(paintingPosX - pointRadius, paintingPosY - pointRadius, pointRadius * 3, pointRadius * 3)
        // ˄
    }

    override fun clear() {
        // ˅
        graphicsContext2D.clearRect(0.0, 0.0, width, height)
        // ˄
    }

    // ˅
    init {
        setWidth(width)
        setHeight(height)
    }
    // ˄
}

// ˅

// ˄
