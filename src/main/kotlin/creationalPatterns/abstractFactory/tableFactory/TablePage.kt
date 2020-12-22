package creationalPatterns.abstractFactory.tableFactory
// ˅
import creationalPatterns.abstractFactory.factory.Item
import creationalPatterns.abstractFactory.factory.Page

// ˄

class TablePage(title: String, author: String) : Page(title, author) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        val builder = StringBuilder()
        builder.append("<html><head><title>$title</title></head><body>\n")
        builder.append("<h1>$title</h1>\n")
        builder.append("<table width=\"80%\" border=\"3\">\n")
        for (content: Item in contents) {
            builder.append("<tr>${content.toHTML()}</tr>\n")
        }
        builder.append("</table>\n")
        builder.append("<hr><address>$author</address>\n")
        builder.append("</body></html>\n")
        return builder.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
