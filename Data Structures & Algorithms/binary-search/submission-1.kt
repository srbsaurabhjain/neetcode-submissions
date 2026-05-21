class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low= 0
        var high= nums.size-1
        var ans=-1
        while(low<=high){
            val mid = low + (high-low)/2
            if(nums[mid]<target){
                // go forward
                low = mid+1
            } else if(nums[mid]>target){
                high = mid -1
            } else{
                return mid
            }
        }
        return ans
    }
}
