class Solution {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        for(i in heights.indices){
            var tempArea=0
            for (j in heights.indices){
                if(i==j || i > j) {
                    continue
                }
                val breadth = minOf(heights[i], heights[j])
                tempArea = (j-i)*breadth
                //i=0, j=1 ->(0+1)*7
                //i=0, j=2 ->(0+1)*7
                //println("_"+i+"_"+j+"_"+breadth+"_"+tempArea)
                if(tempArea>maxArea){
                    maxArea=tempArea
                }    
            }
        }
        return maxArea
    }
}
