package structuralPatterns.facade

/*
Create a simple homepage through a Facade("PageCreator"). The Facade gets info from the "DataLibrary" and uses the info create an HTML file.
 */

fun main(args: Array<String>) {
    PageCreator.createSimpleHomepage("emily@example.com", "Homepage.html")
}
