package creationalPatterns.factoryMethod.framework
// ˅

// ˄

abstract class Factory {
    // ˅
    
    // ˄

    fun create(owner: String): Product {
        // ˅
        // Write pre-creation code here, if any.

        val product = createProduct(owner)

        // Write post-creation code here, if any.

        return product
        // ˄
    }

    protected abstract fun createProduct(owner: String): Product

    // ˅
    
    // ˄
}

// ˅

// ˄
