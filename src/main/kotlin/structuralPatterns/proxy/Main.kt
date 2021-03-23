package structuralPatterns.proxy

/*
Print on a named printer. Setting and changing the printer name is done by Proxy (PrinterProxy).
At the time of printing, create an instance of the RealSubject (RealPrinter) for the first time.
 */

fun main(args: Array<String>) {
    val p = ProxyPrinter("PRINTER-A")
    println("The printer name is ${p.getName()}.")
    p.changeName("PRINTER-B")
    println("The printer name is ${p.getName()}.")

    println("Print start.")
    p.output("Nice to meet you.")
    println("Print exit.")
}
