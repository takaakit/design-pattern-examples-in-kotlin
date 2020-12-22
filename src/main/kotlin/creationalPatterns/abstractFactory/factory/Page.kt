package creationalPatterns.abstractFactory.factory
// ˅
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*

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
        FileWriter(fileName).use { writer -> writer.write(toHTML()) }
        println("$fileName has been created.")
        println("Output File: ${File(File(".").absoluteFile.parent, fileName).path}")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
