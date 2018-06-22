package structuralPatterns.facade
// ˅
import java.io.FileInputStream
import java.util.Properties

// ˄

object DataLibrary {
    // ˅
    
    // ˄

    // Read a data library file.
    fun getProperties(dataLibraryName: String): Properties {
        // ˅
        val filename = "$dataLibraryName.txt"
        val prop = Properties()
        prop.load(FileInputStream(filename))

        return prop
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
