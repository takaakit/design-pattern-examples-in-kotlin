package behavioralPatterns.observer

// Observers observe objects generating a numerical value and display the value.

fun main(args: Array<String>) {
    val number = RandomNumber()
    val digitObserver = DigitObserver()
    val barChartObserver = BarChartObserver()
    number.addObserver(digitObserver)
    number.addObserver(barChartObserver)
    number.generate()
}
