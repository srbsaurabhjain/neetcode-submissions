class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var count = IntArray(26)
        var left = 0
        var maxFreq=0
        var res=0

        for(right in s.indices){
            val r=s[right] - 'A'
            count[r]++
            maxFreq=maxOf(maxFreq, count[r])
            
            val window = right-left+1
            if(window-maxFreq>k){
                count[s[left]-'A']--
                left++
            }
            res = maxOf(maxFreq, right-left+1)
        }
        return res
    }
}
