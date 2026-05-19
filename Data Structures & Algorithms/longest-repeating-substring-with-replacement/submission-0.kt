class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var count = IntArray(26)
        var left=0
        var maxFreq=0
        var result=0
        for (right in s.indices){
            val rIdx = s[right] - 'A'
            count[rIdx]++
            maxFreq=maxOf(maxFreq, count[rIdx])

            if((right-left+1) -maxFreq > k){
                count[s[left]- 'A']--
                left++
            }

            result=maxOf(result, right-left+1)
        }
        return result
    }
}
