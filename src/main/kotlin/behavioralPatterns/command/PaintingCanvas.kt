package behavioralPatterns.command
// ˅
import javafx.scene.canvas.Canvas
import javafx.scene.paint.Color

// ˄

class PaintingCanvas(width: Double, height: Double) : Canvas(), PaintingTarget {
    // ˅
    // ˄

    private val paintingColor: Color = Color.LIGHTGREEN
        // ˅
        
        // ˄

    // Radius of the painting point
    private val pointRadius: Double = 6.0
        // ˅
        
        // ˄

    override fun paint(x: Double, y: Double) {
        // ˅
        graphicsContext2D.fill = paintingColor
        graphicsContext2D.fillOval(x - pointRadius, y - pointRadius, pointRadius * 3, pointRadius * 3)
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
