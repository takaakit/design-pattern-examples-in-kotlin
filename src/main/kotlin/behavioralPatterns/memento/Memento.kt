package behavioralPatterns.memento
// ˅

// ˄

class Memento internal constructor(money: Int) {
    // ˅
    
    // ˄

    // Money
    internal var money: Int = money
        // ˅
        private set
        // ˄

    // Desserts
    internal var desserts: MutableList<String> = mutableListOf<String>()
        // ˅
        
        // ˄

    // Add a dessert
    internal fun addDessert(dessert: String) {
        // ˅
        desserts.add(dessert)
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄
