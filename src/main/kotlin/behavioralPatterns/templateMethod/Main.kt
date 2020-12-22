package behavioralPatterns.templateMethod

/*
Display a character or string repeatedly 5 times.
 */

fun main(args: Array<String>) {
    val display1 = CharDisplay('H')
    display1.output()

    val display2 = StringDisplay("Hello world.")
    display2.output()
}
