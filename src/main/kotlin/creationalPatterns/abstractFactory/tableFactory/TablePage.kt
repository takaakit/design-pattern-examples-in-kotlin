package creationalPatterns.abstractFactory.tableFactory
// ˅
import creationalPatterns.abstractFactory.factory.Page
import creationalPatterns.abstractFactory.factory.Item

// ˄

class TablePage(title: String, author: String) : Page(title, author) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        val buffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head><body>\n")
        buffer.append("<h1>$title</h1>\n")
        buffer.append("<table width=\"80%\" border=\"3\">\n")
        for (content: Item in contents) {
            buffer.append("<tr>${content.toHTML()}</tr>\n")
        }
        buffer.append("</table>\n")
        buffer.append("<hr><address>$author</address>\n")
        buffer.append("</body></html>\n")
        return buffer.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
