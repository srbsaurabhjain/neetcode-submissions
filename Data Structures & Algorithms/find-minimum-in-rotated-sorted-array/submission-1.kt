class Solution {
    fun findMin(nums: IntArray): Int {
        return nums.min()
        var left = 0
        var right = nums.size - 1
        var min = nums[0]
        while(left<=right){
            if(nums[left]>nums[right]){
                return nums[right]
            } else {
                left++
            }
        }
        return min
    }
}
