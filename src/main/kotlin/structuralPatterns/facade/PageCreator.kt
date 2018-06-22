package structuralPatterns.facade
// ˅
import java.io.FileWriter

// ˄

object PageCreator {
    // ˅
    
    // ˄

    fun createSimpleHomepage(mailAddress: String, htmlFileName: String) {
        // ˅
        val addressBook = DataLibrary.getProperties("src/main/kotlin/structuralPatterns/facade/addressbook")
        val userName = addressBook.getProperty(mailAddress)
        val writer = HtmlWriter(FileWriter(htmlFileName))
        writer.heading("$userName's homepage")
        writer.paragraph("Welcome to $userName's homepage.")
        writer.paragraph("Please email me at this address.")
        writer.mailto(mailAddress, userName)
        writer.close()
        println("$htmlFileName is created for $mailAddress ($userName)")
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
