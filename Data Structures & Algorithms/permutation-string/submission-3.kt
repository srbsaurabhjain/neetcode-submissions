class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1Len = s1.length
        val s1Freq = IntArray(26)
        val freq = IntArray(26)
        var match = false
        var left=0
        for(i in s1){
            s1Freq[i-'a']++
        }
        //println(s1Freq.contentToString())
        //println(s1Freq.contentEquals(s2Freq))
        for(right in s2.indices){
            val idx = s2[right] - 'a'
            freq[idx]++
            val windowSize=(right-left) +1

            if(windowSize>s1Len){
                freq[s2[left] - 'a']--
                left++
            }
            if(s1Freq.contentEquals(freq)){
                return true
            }
        }
        return match
    }
}
