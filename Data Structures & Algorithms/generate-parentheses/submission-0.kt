class Solution {
    fun dfs(com: String, n: Int, coms: MutableList<String>){
        if(com.length==(2*n)){
            coms.add(com)
            println(com)
        }
        if(com.count{it=='('} <n){
            // com= com + "("
            dfs(com + "(", n, coms)
        }
        if(com.count{it==')'}< com.count{it=='('}){
            // com=com+")"
            dfs(com+")", n, coms)
        }
    }

    fun generateParenthesis(n: Int): List<String> {
        var result = mutableListOf<String>()
        var opCount = 0
        var clCount = 0
        var com=""
        dfs(com, n, result)
        
        println(result)
        return result
    }
}
