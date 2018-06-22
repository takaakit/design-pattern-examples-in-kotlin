package structuralPatterns.flyweight

// First, create instances for displaying large size characters, then display large size character string using that instances.

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: java Main digits")
        println("Ex.  : java Main 1212123")
    }
    else {
        val bs = LargeSizeString(args[0])
        bs.display()
    }
}
