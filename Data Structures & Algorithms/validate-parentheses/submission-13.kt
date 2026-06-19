class Solution {
    fun isValid(s: String): Boolean {
        if(s.length%2!=0){
            return false
        }
        var queue = ArrayDeque<Char>()
        var map = mapOf('(' to ')', '{' to '}', '[' to ']')

        for(i in s){
            if(i == '(') queue.add(')')
            else if(i == '{') queue.add('}')
            else if(i == '[') queue.add(']')
            else{
                if(queue.size==0) return false
                if(queue.last==i){
                    queue.removeLast()
                } else return false
            }
        }
        if(queue.size==0) return true else return false
    }
}
