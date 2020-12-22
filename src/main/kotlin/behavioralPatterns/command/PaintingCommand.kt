package behavioralPatterns.command
// ˅
// ˄

// Command to paint a single point
class PaintingCommand(paintingTarget: PaintingTarget, paintingPosX: Double, paintingPosY: Double) : Command {
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

    private val paintingTarget: PaintingTarget = paintingTarget
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
