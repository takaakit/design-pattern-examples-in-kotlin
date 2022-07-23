package creationalPatterns.factoryMethod.framework
// ˅

// ˄

abstract class Factory {
    // ˅
    
    // ˄

    fun create(owner: String): Product {
        // ˅
        // Write pre-creation code here.

        // Encapsulate the knowledge of which Product subclass to create and move this knowledge out of the framework.
        val product = createProduct(owner)

        // Write post-creation code here.

        return product
        // ˄
    }

    protected abstract fun createProduct(owner: String): Product

    // ˅
    
    // ˄
}

// ˅

// ˄
