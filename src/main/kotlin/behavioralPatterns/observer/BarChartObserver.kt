package behavioralPatterns.observer
// ˅

// ˄

// Display values with a bar chart.
class BarChartObserver : Observer {
    // ˅
    
    // ˄

    override fun update(number: Number) {
        // ˅
        print("Bar chart: ")
        for (i in 0 until number.value) {
            print("*")
        }
        println("")
        Thread.sleep(100)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
