package creationalPatterns.abstractFactory.listFactory
// ˅
import creationalPatterns.abstractFactory.factory.Data
import creationalPatterns.abstractFactory.factory.Factory
import creationalPatterns.abstractFactory.factory.Link
import creationalPatterns.abstractFactory.factory.Page

// ˄

class ListFactory : Factory {
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
