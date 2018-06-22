package behavioralPatterns.templateMethod

// Display the character and string repeatedly 5 times.

fun main(args: Array<String>) {
    val display1 = CharDisplay('H')                       // Create an instance of the CharDisplay
    val display2 = StringDisplay("Hello world.")          // Create an instance of the StringDisplay
    val display3 = StringDisplay("Nice to meet you.")     // Create an instance of the StringDisplay

    // Any instance can be called with the same method name
    display1.output()
    display2.output()
    display3.output()
}
