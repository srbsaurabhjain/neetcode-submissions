class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        // nums.sort()
        //println(nums.sorted())
        var longCount=1
        var finalCount=0
        val sortedList = nums.sorted()
        val size = sortedList.size
        if(size==1) return 1
        for(i in 0..(size-2)){
            //println("_"+sortedList[i+1]+"_"+sortedList[i])
            if(sortedList[i+1] - sortedList[i]==1){
                longCount++
                //println(longCount)
            } else if(sortedList[i+1] - sortedList[i]==0){
                // continue
            }
            else {
                longCount=1
            }

            if(longCount>finalCount){
                    finalCount=longCount
                }
        }
        return finalCount
    }
}
