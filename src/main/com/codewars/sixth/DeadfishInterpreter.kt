package main.com.codewars.sixth

class DeadfishInterpreter {

    fun parse(data: String): List<Int> {
        val charData = data.toCharArray()
        val charIterator = charData.iterator()
        val resultList = ArrayList<Int>()
        var sum = 0
        while (charIterator.hasNext()){
            when(charIterator.nextChar()){
                'i' -> sum++
                'd' -> sum--
                's' -> sum *= sum
                'o' -> resultList.add(sum)
            }
        }
        return resultList.toList()
    }

    init {

    }
}