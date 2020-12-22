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
        val builder = StringBuilder()
        builder.append("<td><table width=\"100%\" border=\"2\">\n")
        builder.append("<tr><td bgcolor=\"#00CC00\" align=\"center\" colspan=\"${items.size}\"><b>$name</b></td></tr>\n")
        builder.append("<tr>\n")
        for (item: Item in items) {
            builder.append(item.toHTML())
        }
        builder.append("</tr>\n")
        builder.append("</table></td>\n")
        return builder.toString()
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄
