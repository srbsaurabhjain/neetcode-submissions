class Solution {
    /*fun dfs(result:IntArray, next: Int, days: Int, i: Int, temperatures:IntArray){
        
        //R1: i=0, n=1, d=0
        //      i=0, n=1, d=0
        //
        println("$i _ $next _ $days")
        if(next>result.size-1){
            println("n greater")
            result[i] = days
            return
        }
        if(temperatures[next]>temperatures[i]){
            result[i] = days+1
            println("setting inside $i to ${result[i]}")
            if(i<result.size-1 && i+2<=result.size-1){
                println(" inside $i _ $next _ $days") 
                dfs(result, i+2, 0, i+1, temperatures)
            }
        } else if(next<result.size-1){
            println("less $i  _ $next _ $days") 
            dfs(result, next+1, days+1, i, temperatures)
        } else {
            result[i] = 0
            println("setting $i to ${result[i]}")
            if(i<result.size -1){
                dfs(result, i+2, 0, i+1, temperatures)
            }
        }
    }
    */
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val size = temperatures.size
        println(size)
        var result = IntArray(size)
        //dfs(result, 1, 0, 0, temperatures)
        var next=1
        for(i in temperatures.indices){
            var next=i+1
            var days=0
            while(next<size){
                if(temperatures[next]>temperatures[i])
                {
                    result[i] = days+1
                    break;

                } else if(next ==(size-1)){
                    result[i] = 0
                    break;
                }
                else {
                    next++
                    days++
                }
            }
        }
        return result
    }
}
