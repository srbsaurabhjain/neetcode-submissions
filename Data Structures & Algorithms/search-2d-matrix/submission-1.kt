class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var combined = intArrayOf()
        for(i in matrix){
            combined = combined + i
        }
        //println(combined.contentToString())
        var low=0
        var high = combined.size-1
        while(low<=high){
            var mid=low+ (high-low)/2
            if(combined[mid]==target){
                return true
            }
            if(combined[mid]>target){
                high = mid -1
            } else{
                low = mid +1
            }

        }
        return false

        /*
        var found = false
        for(i in matrix){
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
        */
    }
}
