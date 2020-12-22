package creationalPatterns.abstractFactory.factory
// ˅
// ˄

interface Factory {

    fun createPage(title: String, author: String): Page

    fun createLink(name: String, url: String): Link

    fun createData(name: String): Data

    // ˅
    
    // ˄
}

// ˅

// ˄
