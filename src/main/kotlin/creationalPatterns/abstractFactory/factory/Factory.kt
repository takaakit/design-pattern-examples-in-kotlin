package creationalPatterns.abstractFactory.factory
// ˅

// ˄

abstract class Factory {
    // ˅
    
    // ˄

    abstract fun createPage(title: String, author: String): Page

    abstract fun createLink(name: String, url: String): Link

    abstract fun createData(name: String): Data

    // ˅
    companion object {
        fun getFactory(classname: String): Factory {
            return Class.forName(classname).newInstance() as Factory
        }
    }
    // ˄
}

// ˅

// ˄
