package creationalPatterns.abstractFactory.listFactory
// ˅
import creationalPatterns.abstractFactory.factory.*

// ˄

class ListFactory : Factory() {
    // ˅
    
    // ˄

    override fun createPage(title: String, author: String): Page {
        // ˅
        return ListPage(title, author)
        // ˄
    }

    override fun createLink(name: String, url: String): Link {
        // ˅
        return ListLink(name, url)
        // ˄
    }

    override fun createData(name: String): Data {
        // ˅
        return ListData(name)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
