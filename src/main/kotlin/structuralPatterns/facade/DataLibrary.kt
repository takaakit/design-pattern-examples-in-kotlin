package structuralPatterns.facade
// ˅
import java.io.FileInputStream
import java.util.*

// ˄

object DataLibrary {
    // ˅
    
    // ˄

    // Read a data library file.
    fun getProperties(dataLibraryFileName: String): Properties {
        // ˅
        val prop = Properties()
        prop.load(FileInputStream(dataLibraryFileName))
        return prop
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
