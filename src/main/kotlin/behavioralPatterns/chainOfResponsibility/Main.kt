package behavioralPatterns.chainOfResponsibility

// Someone handles a trouble.

fun main(args: Array<String>) {
    val emily = LazySupporter("Emily")
    val william = MoodySupporter("William")
    val amelia = SpecialSupporter("Amelia", 153)
    val michael = SpecialSupporter("Michael", 340)
    val joseph = LimitedSupporter("Joseph", 250)
    val lily = LimitedSupporter("Lily", 350)

    // Make a chain.
    emily.setNext(william).setNext(amelia).setNext(michael).setNext(joseph).setNext(lily)

    // Various troubles occurred.
    for (i in 0..500 step 17) {
        emily.support(Trouble(i))
    }
}
