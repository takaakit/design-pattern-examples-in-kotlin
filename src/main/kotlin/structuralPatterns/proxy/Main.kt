package structuralPatterns.proxy

/*
Print on a named printer. Setting and changing the printer name is done by Proxy (PrinterProxy).
At the time of printing, create an instance of the RealSubject (RealPrinter) for the first time.
 */

fun main(args: Array<String>) {
    val p = PrinterProxy("PRINTER-A")
    println("The printer name is ${p.printerName}.")
    p.printerName = "PRINTER-B"
    println("The printer name is ${p.printerName}.")

    println("Print start.")
    p.output("Nice to meet you.")
    println("Print exit.")
}
