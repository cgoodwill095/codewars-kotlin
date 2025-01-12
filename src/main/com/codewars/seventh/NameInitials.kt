package main.com.codewars.seventh

class NameInitials{

    fun testAbbrevName(){
        print(abbrevName("Connor Goodwill"))
    }

    fun abbrevName(name: String): String {
        val split = name.split(" ")
        return split[0].substring(0,1).uppercase()+"."+ split[1].substring(0,1).uppercase()
    }
}