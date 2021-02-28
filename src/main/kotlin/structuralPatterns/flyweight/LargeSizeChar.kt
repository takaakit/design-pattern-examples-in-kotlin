package structuralPatterns.flyweight
// ˅
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.lang.StringBuilder

// ˄

class LargeSizeChar(charName: Char) {
    // ˅
    // ˄

    // Display data of the large size character
    private var displayData: String
        // ˅
        
        // ˄

    // Display the large size character
    fun display() {
        // ˅
        println(displayData)
        // ˄
    }

    // ˅
    init {
        try {
            val reader = BufferedReader(FileReader("src/main/kotlin/structuralPatterns/Flyweight/big$charName.txt"))
            var line: String? = ""
            val builder = StringBuilder()
            while ({line = reader.readLine(); line}() != null) {
                builder.append(line)
                builder.append("\n")
            }
            reader.close()
            displayData = builder.toString()
        }
        catch (e: IOException) {
            displayData = "$charName?"
        }
    }
    // ˄
}

// ˅

// ˄
