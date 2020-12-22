package behavioralPatterns.chainOfResponsibility

/*
A trouble is turned around among supporters, and the trouble will be handled by the supporter who can handle it. There are four types of supporters below:
* "LazySupporter" doesn't handle any trouble
* "MoodySupporter" handles odd ID troubles
* "SpecialSupporter" handles a trouble of the target ID.
* "LimitedSupporter" handles troubles below the limit ID.
 */

fun main(args: Array<String>) {
    val emily = LazySupporter("Emily")
    val william = MoodySupporter("William")
    val amelia = SpecialSupporter("Amelia", 6)
    val joseph = LimitedSupporter("Joseph", 5)

    // Make a chain.
    emily.setNext(william).setNext(amelia).setNext(joseph)

    // Various troubles occurred.
    for (i in 0..9) {
        emily.support(Trouble(i))
    }
}
