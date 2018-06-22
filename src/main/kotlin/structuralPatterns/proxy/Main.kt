package structuralPatterns.proxy

// At the time of printing, create an instance of the printer for the first time.
// In order to spend time creating a printer, call a heavy task when creating a printer instance.

fun main(args: Array<String>) {
    val p = PrinterProxy("Emily's printer")
    println("The current printer is ${p.printerName}.")
    p.printerName = "William's printer"
    println("The current printer is ${p.printerName}.")
    p.output("Nice to meet you.")
}
