class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var map = mutableMapOf<Int, Int>()
        for(i in nums){
            if(map[i]==null) map[i] = 1
            else map[i] = map[i]!!+1
        }
        for(i in map.keys){
            if(map[i]!!>1){
                return i
            }
        }
        return 0
    }
}
