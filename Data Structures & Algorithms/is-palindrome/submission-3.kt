class Solution {
    fun isPalindrome(s: String): Boolean {
        val t= s.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
        val rev = t.reversed()
        //println(t+"_"+rev)
        return t==rev
    }
}
