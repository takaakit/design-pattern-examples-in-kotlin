package creationalPatterns.builder

// Create documents in HTML format and text format.

fun main(args: Array<String>) {
    if (args.size != 1) {
        showUsage()
    }
    else if (args[0] == "plain") {
        val plainTextBuilder: PlainTextBuilder = PlainTextBuilder()
        val director: Director = Director(plainTextBuilder)
        director.build()
        val content = plainTextBuilder.result
        println(content)
    }
    else if (args[0] == "html") {
        val htmlBuilder: HTMLBuilder = HTMLBuilder()
        val director: Director = Director(htmlBuilder)
        director.build()
        val filename = htmlBuilder.result
        println("$filename has been created.")
    }
    else {
        showUsage()
    }
}

fun showUsage() {
    println("Usage 1: java Main plain      <- Create a document in plain text.")
    println("Usage 2: java Main html       <- Create a document in HTML.")
}
