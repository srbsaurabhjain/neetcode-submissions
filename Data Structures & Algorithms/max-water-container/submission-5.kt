class Solution {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = heights.size-1
        var count=0
        while(left<right){
            val breadth = minOf(heights[left], heights[right])
            val tempArea = (right-left)*breadth
            if(tempArea>maxArea){
                    maxArea=tempArea
                }
                //right--
                //if(left==right){
                  //  left++
                    //right=heights.size-1
                //}
                if(heights[left]<heights[right]) left++
                else right--
                count++
        }
                //println(count)

/*
        for(i in heights.indices){
            var tempArea=0
            for (j in heights.indices){
                if(i==j || i > j) {
                    continue
                }
                val breadth = minOf(heights[i], heights[j])
                tempArea = (j-i)*breadth
                if(tempArea>maxArea){
                    maxArea=tempArea
                }    
            }
        }*/
        return maxArea
    }
}
