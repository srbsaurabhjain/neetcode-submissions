class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var found = false
        for(i in matrix){
            println(i)
            var low=0
            var high = i.size-1
            while(low<=high){
                var mid=low+ (high-low)/2
                if(i[mid]==target){
                    found = true
                    break
                }

                if(i[mid]>target){
                    high = mid -1
                } else{
                    low = mid +1
                }
            }
            if(found){
                println("got it")
                return found
            }
        }
        return found
    }
}
