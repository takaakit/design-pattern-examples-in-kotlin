package creationalPatterns.abstractFactory.listFactory
// ˅
import creationalPatterns.abstractFactory.factory.Page
import creationalPatterns.abstractFactory.factory.Item

// ˄

class ListPage(title: String, author: String) : Page(title, author) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        val buffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head>\n")
        buffer.append("<body><h1>$title</h1>\n")
        buffer.append("<ul>\n")
        for (content: Item in contents) {
            buffer.append(content.toHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("<hr><address>$author</address>")
        buffer.append("</body></html>\n")
        return buffer.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
