package creationalPatterns.abstractFactory.factory
// ˅
import java.io.FileWriter

// ˄

abstract class Page(title: String, author: String) {
    // ˅
    
    // ˄

    protected val title: String = title
        // ˅
        
        // ˄

    protected val author: String = author
        // ˅
        
        // ˄

    protected var contents: MutableList<Item> = mutableListOf<Item>()
        // ˅
        
        // ˄

    abstract fun toHTML(): String

    fun add(item: Item) {
        // ˅
        contents.add(item)
        // ˄
    }

    fun output() {
        // ˅
        val fileName = "$title.html"
        val writer = FileWriter(fileName)
        writer.write(this.toHTML())
        writer.close()
        println("$fileName has been created.")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
