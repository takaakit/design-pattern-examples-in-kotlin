package structuralPatterns.bridge

/*
Display only one line or display the specified number of lines.
 */

fun main(args: Array<String>) {
    val d1 = Display(TextDisplayImpl("Japan"))
    d1.output()

    val d2 = MultiLineDisplay(TextDisplayImpl("The United States of America"))
    d2.output()
    d2.outputMultiple(3)
}
