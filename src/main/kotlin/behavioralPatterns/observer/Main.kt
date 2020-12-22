package behavioralPatterns.observer

/*
Observers observe objects generating a numerical value and display the value. The display formats are digits and bar charts.
 */

fun main(args: Array<String>) {
    val number = RandomNumber()
    val digitObserver = DigitObserver()
    number.addObserver(digitObserver)
    val barChartObserver = BarChartObserver()
    number.addObserver(barChartObserver)
    number.generate()
}
