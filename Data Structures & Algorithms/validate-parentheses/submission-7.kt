class Solution {
    fun isValid(s: String): Boolean {
        if(s.length % 2 !=0){
            return false
        }
        val bracketsMap = mapOf('(' to ')', '{' to '}', '[' to ']')
        var brackets = mutableListOf<Char>()
        for(i in s.indices){
            if(brackets.size==0 && s[i] in bracketsMap.values){
                return false
            }
            if( s[i] in bracketsMap.keys){
                brackets.add(bracketsMap[s[i]]!!)
            } else if( s[i] in bracketsMap.values){
                if(brackets.last()==s[i]){
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
