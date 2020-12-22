package creationalPatterns.abstractFactory.listFactory
// ˅
import creationalPatterns.abstractFactory.factory.Item
import creationalPatterns.abstractFactory.factory.Page

// ˄

class ListPage(title: String, author: String) : Page(title, author) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        val builder = StringBuilder()
        builder.append("<html><head><title>$title</title></head>\n")
        builder.append("<body><h1>$title</h1>\n")
        builder.append("<ul>\n")
        for (content: Item in contents) {
            builder.append(content.toHTML())
        }
        builder.append("</ul>\n")
        builder.append("<hr><address>$author</address>")
        builder.append("</body></html>\n")
        return builder.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
