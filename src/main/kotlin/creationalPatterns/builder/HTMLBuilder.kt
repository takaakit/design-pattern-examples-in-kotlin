package creationalPatterns.builder
// ˅
import java.io.PrintWriter
import java.io.FileWriter

// ˄

class HTMLBuilder : Builder() {
    // ˅
    
    // ˄

    // File name to create
    var result: String? = null
        // ˅
        private set
        // ˄

    private var writer: PrintWriter? = null
        // ˅
        
        // ˄

    // Make a title of HTML file
    override fun createTitle(title: String) {
        // ˅
        result = "$title.html"                     // Set a title as a file name
        writer = PrintWriter(FileWriter(result))
        writer?.println("<html><head><title>$title</title></head><body>")  // Write a title
        writer?.println("<h1>$title</h1>")
        // ˄
    }

    // Make a section of HTML file
    override fun createSection(section: String) {
        // ˅
        writer?.println("<p>$section</p>")        // Write a section
        // ˄
    }

    // Make items of HTML file
    override fun createItems(items: Array<String>) {
        // ˅
        writer?.println("<ul>")                  // Write items
        for (i in items.indices) {
            writer?.println("<li>" + items[i] + "</li>")
        }
        writer?.println("</ul>")
        // ˄
    }

    override fun close() {
        // ˅
        writer?.println("</body></html>")
        writer?.close()                         // Close file
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄