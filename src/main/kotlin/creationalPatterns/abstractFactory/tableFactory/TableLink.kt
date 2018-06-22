package creationalPatterns.abstractFactory.tableFactory
// ˅
import creationalPatterns.abstractFactory.factory.Link

// ˄

class TableLink(name: String, url: String) : Link(name, url) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        return "  <td><a href=\"$url\">$name</a></td>\n"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
