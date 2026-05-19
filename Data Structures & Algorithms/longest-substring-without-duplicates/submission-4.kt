class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var word =""
        var wordLength=0
        for(i in s){
            if(i in word){
                //wordLength=maxOf(wordLength, word.length)
                word=word.split(i)[1]+i
            }
            else word = word+i
            wordLength=maxOf(wordLength, word.length)
            println(word)
        }
        return wordLength
    }
}
