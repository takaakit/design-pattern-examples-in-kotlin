package creationalPatterns.factoryMethod.idCard
// ˅
import creationalPatterns.factoryMethod.framework.Factory
import creationalPatterns.factoryMethod.framework.Product

// ˄

class CreditCardFactory : Factory() {
    // ˅
    // ˄

    override fun createProduct(owner: String): Product {
        // ˅
        return CreditCard(owner)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
