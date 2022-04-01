package behavioralPatterns.observer

import java.util.*

/*
Observers observe objects generating a numerical value and display the value.
The display formats are digits and bar charts.
 */

fun main() {
    val numberSubject = NumberSubject()
    numberSubject.attach(DigitObserver(numberSubject))
    numberSubject.attach(BarChartObserver(numberSubject))

    val random = Random()
    for (i in 0..19) {
        numberSubject.value = random.nextInt(50)
        Thread.sleep(200)
    }
}
