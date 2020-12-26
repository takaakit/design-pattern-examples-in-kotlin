package structuralPatterns.facade
// ˅
import java.io.Writer

// ˄

class HtmlWriter internal constructor(writer: Writer) {
    // ˅
    
    // ˄

    private val writer: Writer = writer
        // ˅
        
        // ˄

    // Write a title
    internal fun heading(title: String) {
        // ˅
        writer.write("<html>")
        writer.write("<head><title>$title</title></head>")
        writer.write("<body>\n")
        writer.write("<h1>$title</h1>\n")
        // ˄
    }

    // Write a paragraph
    internal fun paragraph(message: String) {
        // ˅
        writer.write("<p>$message</p>\n")
        // ˄
    }

    // Write a mail address
    internal fun mailto(mailAddress: String, userName: String) {
        // ˅
        anchor("mailto:$mailAddress", userName)
        // ˄
    }

    internal fun close() {
        // ˅
        writer.write("</body>")
        writer.write("</html>\n")
        writer.close()
        // ˄
    }

    // Write a link
    private fun anchor(url: String, text: String) {
        // ˅
        paragraph("<a href=\"$url\">$text</a>")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
