class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var result = mutableSetOf<List<Int>>()
        val size= nums.size-1
        for(i in 0..size){
            for(j in 0..size){
                for(k in 0..size){
                    val sum=nums[i]+nums[j]+nums[k]
                    if(sum==0 && i!=j && j!=k && i!=k){
                    var level = mutableListOf<Int>()
                        level.add(nums[i])
                        level.add(nums[j])
                        level.add(nums[k])
                        level.sort()
                        //println(level)
                        result.add(level)
                    }
                }
            }
        }
        return result.toList()
    }
}
