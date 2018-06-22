package creationalPatterns.factoryMethod

// Factory to make ID cards.

import creationalPatterns.factoryMethod.idCard.CreditCardFactory

fun main(args: Array<String>) {
    val factory = CreditCardFactory()

    val jacksonCard = factory.create("Jackson")
    jacksonCard.use()

    val sophiaCard = factory.create("Sophia")
    sophiaCard.use()

    val oliviaCard = factory.create("Olivia")
    oliviaCard.use()
}
