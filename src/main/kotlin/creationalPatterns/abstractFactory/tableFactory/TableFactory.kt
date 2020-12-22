package creationalPatterns.abstractFactory.tableFactory
// ˅
import creationalPatterns.abstractFactory.factory.Data
import creationalPatterns.abstractFactory.factory.Factory
import creationalPatterns.abstractFactory.factory.Link
import creationalPatterns.abstractFactory.factory.Page

// ˄

class TableFactory : Factory {
    // ˅
    // ˄

    override fun createPage(title: String, author: String): Page {
        // ˅
        return TablePage(title, author)
        // ˄
    }

    override fun createLink(name: String, url: String): Link {
        // ˅
        return TableLink(name, url)
        // ˄
    }

    override fun createData(name: String): Data {
        // ˅
        return TableData(name)
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
