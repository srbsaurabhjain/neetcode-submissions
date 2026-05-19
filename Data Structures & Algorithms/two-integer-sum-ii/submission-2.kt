class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val mutList = mutableListOf<Int>()
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
        return mutList.toIntArray()
    }
}
