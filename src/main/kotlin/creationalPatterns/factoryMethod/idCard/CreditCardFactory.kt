package creationalPatterns.factoryMethod.idCard
// ˅
import creationalPatterns.factoryMethod.framework.Factory
import creationalPatterns.factoryMethod.framework.Product

// ˄

class CreditCardFactory : Factory() {
    // ˅
    // ˄

    private val cardOwners: MutableList<String> = mutableListOf<String>()
        // ˅

        // ˄

    override fun createProduct(owner: String): Product {
        // ˅
        return CreditCard(owner)
        // ˄
    }

    override fun registerProduct(product: Product) {
        // ˅
        cardOwners.add((product as CreditCard).owner)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
