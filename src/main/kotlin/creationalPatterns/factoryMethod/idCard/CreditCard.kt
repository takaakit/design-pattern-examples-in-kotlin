package creationalPatterns.factoryMethod.idCard
// ˅
import creationalPatterns.factoryMethod.framework.Product

// ˄

class CreditCard(owner: String) : Product {
    // ˅
    
    // ˄

    val owner: String = owner
        // ˅
        
        // ˄

    override fun use() {
        // ˅
        println("Use $owner's card.")
        // ˄
    }

    // ˅
    init {
        println("Make $owner's card.")
    }
    // ˄
}

// ˅

// ˄
