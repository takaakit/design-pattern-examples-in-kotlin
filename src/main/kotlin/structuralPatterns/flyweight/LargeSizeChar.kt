package structuralPatterns.flyweight
// ˅
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

// ˄

class LargeSizeChar(charName: Char) {
    // ˅
    
    // ˄

    private val charName: Char = charName
        // ˅
        
        // ˄

    // Display data of the large size character
    private var displayData: String? = null
        // ˅
        
        // ˄

    // Display the large size character
    fun display() {
        // ˅
        print(displayData)
        // ˄
    }

    // ˅
    init {
        try {
            val reader = BufferedReader(FileReader("src/main/kotlin/structuralPatterns/Flyweight/big$charName.txt"))
            var line: String? = ""
            val buf = StringBuffer()
            while ({line = reader.readLine(); line}() != null) {
                buf.append(line)
                buf.append("\n")
            }
            reader.close()
            displayData = buf.toString()
        }
        catch (e: IOException) {
            displayData = "$charName?"
        }
    }
    // ˄
}

// ˅

// ˄
