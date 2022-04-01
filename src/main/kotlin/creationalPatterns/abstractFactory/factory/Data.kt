package creationalPatterns.abstractFactory.factory
// ˅

// ˄

abstract class Data(name: String) : Item(name) {
    // ˅
    
    // ˄

    protected var items: MutableList<Item> = mutableListOf()
        // ˅
        
        // ˄

    fun add(item: Item) {
        // ˅
        items.add(item)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
