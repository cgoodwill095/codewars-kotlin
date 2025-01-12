package main.com.codewars.seventh

class ReduceButGrow {

    fun grow(arr: IntArray): Int {
        var sum = 1;
        for(value in arr){
            sum*=value
        }
        return sum;
    }
}