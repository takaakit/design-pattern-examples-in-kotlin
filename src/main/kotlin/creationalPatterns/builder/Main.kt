package creationalPatterns.builder

import java.io.File
import java.util.*
import kotlin.system.exitProcess

/*
Create documents in HTML format and text format. It is possible to create different documents
in the same construction process.
 */

fun main() {
    println("Please enter \"plain\" or \"html\":")
    val scan = Scanner(System.`in`)
    val inputValue = scan.next()

    if (inputValue == "plain") {
        val plainTextBuilder = PlainTextBuilder()
        val director = Director(plainTextBuilder)
        director.build()
        val content = plainTextBuilder.content
        println(content)
    } else if (inputValue == "html") {
        val htmlBuilder = HTMLBuilder()
        val director = Director(htmlBuilder)
        director.build()
        val fileName = htmlBuilder.fileName
        println("$fileName has been created.")
        println("Output File: ${File(File(".").absoluteFile.parent, fileName!!).path}")
    } else {
        System.err.println("The value is not \"plain\" or \"html\".")
        exitProcess(-1)
    }
}
