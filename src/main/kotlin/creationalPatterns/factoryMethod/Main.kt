package creationalPatterns.factoryMethod

import creationalPatterns.factoryMethod.idCard.CreditCardFactory

/*
Create documents in HTML format and text format. It is possible to create different documents in the same construction process.
 */

fun main(args: Array<String>) {
    val factory = CreditCardFactory()

    val jacksonCard = factory.create("Jackson")
    jacksonCard.use()

    val sophiaCard = factory.create("Sophia")
    sophiaCard.use()

    val oliviaCard = factory.create("Olivia")
    oliviaCard.use()
}
