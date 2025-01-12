package main.com.codewars.seventh

class Evaporator {

    fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
        val limit = (content/100)*threshold
        val reductionRate = (100-evap_per_day)/100
        var count = 0;
        var contentBody = content;
        while(contentBody>limit){
            contentBody *= reductionRate
            count++
        }
        return count;
    }
}
