package creationalPatterns.abstractFactory.tableFactory
// ˅
import creationalPatterns.abstractFactory.factory.Data
import creationalPatterns.abstractFactory.factory.Item

// ˄

class TableData(name: String) : Data(name) {
    // ˅
    
    // ˄

    override fun toHTML(): String {
        // ˅
        val buffer = StringBuffer()
        buffer.append("<td><table width=\"100%\" border=\"2\">\n")
        buffer.append("<tr><td bgcolor=\"#00CC00\" align=\"center\" colspan=\"${items.size}\"><b>$name</b></td></tr>\n")
        buffer.append("<tr>\n")
        for (item: Item in items) {
            buffer.append(item.toHTML())
        }
        buffer.append("</tr>\n")
        buffer.append("</table></td>\n")
        return buffer.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
