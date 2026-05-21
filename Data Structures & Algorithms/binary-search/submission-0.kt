class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low= 0
        var high= nums.size-1
        var ans=-1
        while(low<=high){
            val mid = low + (high-low)/2
            println(mid)
            // r1- m=5-0/2 = 2 -> 2<4 go forward
            // r2- m=3+(5-2/2)=4 -> 6>4 low=4, high=4
            // r3- m=
            if(low==high && nums[mid]!=target){
                break
            }
            if(nums[mid]<target){
                // go forward
                low = mid+1
            } else if(nums[mid]>target){
                high = mid
            } else{
                return mid
            }
        }
        return ans
    }
}
