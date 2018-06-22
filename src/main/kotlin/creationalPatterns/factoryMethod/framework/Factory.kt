package creationalPatterns.factoryMethod.framework
// ˅

// ˄

abstract class Factory {
    // ˅
    
    // ˄

    fun create(owner: String): Product {
        // ˅
        val product = createProduct(owner)
        registerProduct(product)
        return product
        // ˄
    }

    protected abstract fun createProduct(owner: String): Product

    protected abstract fun registerProduct(product: Product)

    // ˅
    
    // ˄
}

// ˅

// ˄
