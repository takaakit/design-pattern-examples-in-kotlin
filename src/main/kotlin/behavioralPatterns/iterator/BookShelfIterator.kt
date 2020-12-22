package behavioralPatterns.iterator
// ˅
// ˄

class BookShelfIterator(bookShelf: BookShelf) : Iterator {
    // ˅
    // ˄

    private var index: Int = 0
        // ˅
        
        // ˄

    private val bookShelf: BookShelf = bookShelf
        // ˅
        
        // ˄

    override fun hasNext(): Boolean {
        // ˅
        return index < bookShelf.numberOfBooks
        // ˄
    }

    override fun next(): Any {
        // ˅
        val book = bookShelf.getAt(index)
        index++
        return book
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
