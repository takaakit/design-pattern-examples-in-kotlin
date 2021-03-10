package behavioralPatterns.observer

/*
Observers observe objects generating a numerical value and display the value.
The display formats are digits and bar charts.
 */

fun main(args: Array<String>) {
    val number = RandomNumber()
    number.addObserver(DigitObserver())
    number.addObserver(BarChartObserver())
    number.generate()
}
