package structuralPatterns.decorator
// ˅

// ˄

abstract class Frame protected constructor(display: Display) : Display() {
    // ˅
    
    // ˄

    protected var display: Display = display
        // ˅
        
        // ˄

    // ˅
    
    // ˄
}

// ˅

// ˄
