class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        
        var left = 0
        var right = numbers.size - 1
        while(left<right){
            val sum = numbers[left] + numbers[right]
            if(sum==target){
                return intArrayOf(left+1, right+1)
            }
            if(sum<target){
                left++

            } else {
                right--

            }
        }
        return intArrayOf()
        /**val mutList = mutableListOf<Int>()
        for (i in numbers.indices){
            for (j in numbers.indices){
                if (i == j) continue
                // println("_"+numbers[i]+"_"+numbers[j])
                if(numbers[i]+numbers[j]==target){
                    mutList.add(i+1)
                    mutList.add(j+1)
                    return mutList.toIntArray()
                }
            }
        }
        return mutList.toIntArray()**/
    }
}
