package structuralPatterns.bridge

// Display only one line or display the specified number of lines.

fun main(args: Array<String>) {
    val d1: Display = Display(TextDisplayImpl("Japan"))
    val d2: MultiLineDisplay = MultiLineDisplay(TextDisplayImpl("The United States of America"))
    val d3: MultiLineDisplay = MultiLineDisplay(TextDisplayImpl("Brazil"))
    d1.display()
    d2.display()
    d3.display()
    d3.displayMultiple(3)
}
