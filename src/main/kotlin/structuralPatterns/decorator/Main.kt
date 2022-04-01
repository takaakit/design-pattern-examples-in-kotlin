package structuralPatterns.decorator

/*
Display a string with decorative frames. The frames can be combined arbitrarily.
 */

fun main() {
    val displayA: Display = MessageDisplay("Nice to meet you.")
    displayA.show()

    val displayB: Display = SideFrame(MessageDisplay("Nice to meet you."), '!')
    displayB.show()

    val displayC: Display = FullFrame(SideFrame(MessageDisplay("Nice to meet you."), '!'))
    displayC.show()
}
