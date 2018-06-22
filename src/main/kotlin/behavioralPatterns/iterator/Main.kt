package behavioralPatterns.iterator

// Add books in the bookshelf and display the names of the books in turn.

fun main(args: Array<String>) {
    val bookShelf = BookShelf(5)
    bookShelf.add(Book("Design Patterns: Elements of Reusable Object-Oriented Software"))
    bookShelf.add(Book("The Object Primer: Agile Model-Driven Development with UML 2.0"))
    bookShelf.add(Book("Software Systems Architecture: Working With Stakeholders Using Viewpoints and Perspectives"))
    bookShelf.add(Book("A Practical Guide to SysML: The Systems Modeling Language"))
    bookShelf.add(Book("A Pattern Language: Towns, Buildings, Construction "))

    val it = bookShelf.iterator()
    while (it.hasNext()) {
        val book = it.next() as Book?
        println(book?.title)
    }
}
