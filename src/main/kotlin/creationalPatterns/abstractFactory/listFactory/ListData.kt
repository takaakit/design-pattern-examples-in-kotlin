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
        val builder = StringBuilder()
        builder.append("<li>$name<ul>\n")
        for (item: Item in items) {
            builder.append(item.toHTML())
        }
        builder.append("</ul></li>\n")
        return builder.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
