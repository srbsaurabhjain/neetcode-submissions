class Solution {
    fun findMin(nums: IntArray): Int {
        //1st sol return nums.min()
        var left = 0
        var right = nums.size - 1
        var min = nums[0]
        
        /* 2nd sol
        while(left<right){
            if(nums[left]>nums[left+1]){
                return nums[left+1]
            } else {
                left++
            }
        }
        return min */
        
        while(left<=right){
            var mid = (left+right)/2
            println("left=$left,mid=$mid,right=$right")
            //0,2,5->3,4,5-> 3,3,4 -> 4,4, 4
            //if(nums[mid]=nums[left] && nums[mid]>nums[right]){
            if(left==right){
                // found it
                return nums[right]
            }
            if(nums[mid]>nums[right]){
                // move right
                left=mid+1
            } else if(nums[mid]<nums[right]){
                // move left
                right = mid
            }
            
        }
        return min
        
    }
}
