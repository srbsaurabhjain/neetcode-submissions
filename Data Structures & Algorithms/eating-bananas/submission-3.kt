class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var lo = 1
        var hi = piles.max()
        var k =  hi
        /**
        for(i in lo..(hi+1)){
            var time = 0
            for(j in piles){
                val t = Math.ceil(j.toDouble()/i)
                time = time + t.toInt()
                println("t=$t, time=$time, for pile=$j")
            }
            println("time=$time, for rate=$i")
            if(time<=h){
                return i
            }
        }
        **/
        while(lo<=hi){
            val mid = (lo+hi)/2
            var time = 0
            for(j in piles){
                val t = Math.ceil(j.toDouble()/mid)
                time = time + t.toInt()
                //println("t=$t, time=$time, for pile=$j")
            }
            println("time=$time, for rate=$mid")
            if(time>h){
                lo=mid+1
            } else {
                hi = mid-1
                k=minOf(k,mid)
                println("k=$k for rate=$mid")
            }
        }
        return k
    }
}
