package behavioralPatterns.observer
// ˅
// ˄

// Display values as a bar chart.
class BarChartObserver(numberSubject: NumberSubject) : Observer {
    // ˅
    // ˄

    private var numberSubject: NumberSubject = numberSubject
        // ˅
        
        // ˄

    override fun update(changedSubject: Subject) {
        // ˅
        if (changedSubject === numberSubject) {
            print("Bar chart: ")
            for (i in 0 until numberSubject.value) {
                print("*")
            }
            println()
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
