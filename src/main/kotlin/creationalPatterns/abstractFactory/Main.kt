package creationalPatterns.abstractFactory

import creationalPatterns.abstractFactory.factory.Factory

// Create a hierarchical link collection as an HTML file.

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: java Main class.name.of.ConcreteFactory")
        println("Ex.1 : java Main creationalPatterns.abstractFactory.listFactory.ListFactory")
        println("Ex.2 : java Main creationalPatterns.abstractFactory.tableFactory.TableFactory")
    }
    else {
        val factory = Factory.getFactory(args[0])

        val washingtonPost = factory.createLink("The Washington Post", "https://www.washingtonpost.com/")
        val newYorkTimes = factory.createLink("The NewYork Times", "https://www.nytimes.com/")
        val financialTimes = factory.createLink("The Financial Times", "https://www.ft.com/")
        val yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/")
        val google = factory.createLink("Google", "https://www.google.com/")
        val mlb = factory.createLink("MLB", "https://www.mlb.com/")
        val fifa = factory.createLink("FIFA", "https://www.fifa.com/")
        val wba = factory.createLink("WBA", "http://www.wbaboxing.com/")
        val wbc = factory.createLink("WBC", "http://www.wbcboxing.com/")

        val newspaper = factory.createData("Newspaper")
        newspaper.add(washingtonPost)
        newspaper.add(newYorkTimes)
        newspaper.add(financialTimes)

        val searchEngine = factory.createData("Search engine")
        searchEngine.add(yahoo)
        searchEngine.add(google)

        val sports = factory.createData("Sports")
        sports.add(mlb)
        sports.add(fifa)
        sports.add(wba)
        sports.add(wbc)

        val linkPage = factory.createPage("LinkPage", "James Smith")
        linkPage.add(newspaper)
        linkPage.add(searchEngine)
        linkPage.add(sports)

        linkPage.output()
    }
}
