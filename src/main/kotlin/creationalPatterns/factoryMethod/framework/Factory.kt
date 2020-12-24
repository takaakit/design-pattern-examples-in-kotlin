package creationalPatterns.factoryMethod.framework
// ˅

// ˄

abstract class Factory {
    // ˅
    
    // ˄

    fun create(owner: String): Product {
        // ˅
        return createProduct(owner)
        // ˄
    }

    protected abstract fun createProduct(owner: String): Product

    // ˅
    
    // ˄
}

// ˅

// ˄
