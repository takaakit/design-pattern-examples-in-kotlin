package behavioralPatterns.iterator
// ˅

// ˄

class BookShelf(maxsize: Int) : Aggregate {
    // ˅
    
    // ˄

    var numberOfBooks: Int = 0
        // ˅
        private set
        // ˄

    private val books: Array<Book?>
        // ˅
        
        // ˄

    override fun iterator(): Iterator {
        // ˅
        return BookShelfIterator(this)
        // ˄
    }

    fun getAt(index: Int): Book? {
        // ˅
        return books[index]
        // ˄
    }

    fun add(book: Book) {
        // ˅
        books[numberOfBooks] = book
        numberOfBooks++
        // ˄
    }

    // ˅
    init {
        books = arrayOfNulls(maxsize)
    }
    // ˄
}

// ˅

// ˄
