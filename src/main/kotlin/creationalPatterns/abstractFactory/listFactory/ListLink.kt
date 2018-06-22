package creationalPatterns.abstractFactory.listFactory
// ˅
import creationalPatterns.abstractFactory.factory.Link

// ˄

class ListLink(name: String, url: String) : Link(name, url) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        return "  <li><a href=\"$url\">$name</a></li>\n"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
