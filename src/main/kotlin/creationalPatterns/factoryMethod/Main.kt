package creationalPatterns.factoryMethod

import creationalPatterns.factoryMethod.creditCard.CreditCardFactory

/*
The subject is a factory to make credit cards. The abstract class("Factory") defines how to create an credit card, but the actual credit card is created by the concrete class("CreditCardFactory").
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
