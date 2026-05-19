class Solution {
    fun isValid(s: String): Boolean {
        if(s.length % 2 !=0){
            return false
        }
        val openBrackets = listOf('(', '{','[')
        val closedBrackets = listOf(')', '}',']')
        //if(s[0] in closedBrackets) return false
        var brackets = mutableListOf<Char>()
        for(i in s.indices){
            if(brackets.size==0 && s[i] in closedBrackets){
                return false
            }
            if( s[i] in openBrackets){
                brackets.add(s[i])
            } else if( s[i] in closedBrackets){
                val ind = closedBrackets.indexOf(s[i])
                if(brackets.last()==openBrackets[ind]){
                    brackets.removeLast()
                } else {return false}
            }
        }
        /*
        val first= s.take(s.length/2)
        val second = s.drop(s.length/2).reversed()
        for(i in first.indices){
            if(first[i]=='('){
                if (second[i]==')') continue else return false
            }
            else if(first[i]=='{') {
                if( second[i]=='}') continue else return false
            }
            else if(first[i]=='[' ) {
                if(second[i]==']') continue else return false
            } 
        }*/
        return brackets.size==0
    }
}
