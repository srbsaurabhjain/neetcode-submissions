class Solution {
    fun findMin(nums: IntArray): Int {
        //return nums.min()
        var left = 0
        var right = nums.size - 1
        var min = nums[0]
        
        while(left<right){
            if(nums[left]>nums[left+1]){
                return nums[left+1]
            } else {
                left++
            }
        }
        return min
        /*
        while(left<=right){
            var mid = (left+right)/2
            println("left=$left,mid=$mid,right=$right")
            if(nums[mid]>nums[left] && nums[mid]>nums[right]){
                // move right
                left=mid+1
            }
            if(nums[mid]<nums[left] && nums[mid]>nums[right] && (mid-left)==1){
                // found it
                return nums[mid]
            }
            if(nums[mid]>nums[left] && nums[mid]<nums[right]){
                // move left
                right = mid - 1
            }
        }
        return min
        */
    }
}
