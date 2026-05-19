class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        var pairPosSpeed = mutableListOf<Pair<Int, Int>>()
        for(i in 0..(position.size-1)){
            pairPosSpeed.add(position[i] to speed[i])
        }
        println(pairPosSpeed)
        val sorted = pairPosSpeed.sortedByDescending({it.first})
        println(sorted)
        var fleets = 0
        var prev = 0.0
        for(i in sorted){
            val time = (target - i.first).toDouble()/i.second
            println(time)
            if(prev<time){
                fleets++
                prev = time
            }
            
        }
        return fleets
    }
}
