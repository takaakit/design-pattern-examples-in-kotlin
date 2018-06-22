package structuralPatterns.decorator

// Display a character string with a decorative frame.

fun main(args: Array<String>) {
    val displayA: Display = MessageDisplay("Nice to meet you.")
    displayA.show()

    val displayB: Display = SideFrame(displayA, '!')
    displayB.show()

    val displayC: Display = FullFrame(displayB)
    displayC.show()

    val displayD: Display = SideFrame(
        FullFrame(
            FullFrame(
                SideFrame(
                    SideFrame(
                        FullFrame(
                            MessageDisplay("See you again.")
                        ),
                        '#'
                    ),
                    '#'
                )
            )
        ),
        '#'
    )
    displayD.show()
}
