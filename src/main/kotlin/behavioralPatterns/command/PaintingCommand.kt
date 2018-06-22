package behavioralPatterns.command
// ˅

// ˄

// Command to paint a single point
class PaintingCommand(paintingObject: PaintingTarget, paintingPosX: Double, paintingPosY: Double) : Command {
    // ˅
    
    // ˄

    // Painting position x
    private val paintingPosX: Double = paintingPosX
        // ˅
        
        // ˄

    // Painting position y
    private val paintingPosY: Double = paintingPosY
        // ˅
        
        // ˄

    protected var paintingTarget: PaintingTarget = paintingObject
        // ˅
        
        // ˄

    override fun execute() {
        // ˅
        paintingTarget.paint(paintingPosX, paintingPosY)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
