package creationalPatterns.abstractFactory.listFactory
// ˅
import creationalPatterns.abstractFactory.factory.Data
import creationalPatterns.abstractFactory.factory.Item

// ˄

class ListData(name: String) : Data(name) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        val buffer = StringBuffer()
        buffer.append("<li>$name<ul>\n")
        for (item: Item in items) {
            buffer.append(item.toHTML())
        }
        buffer.append("</ul></li>\n")
        return buffer.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
