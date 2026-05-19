class Solution {
    fun dfs(opCount: Int, clCount: Int, com: String, n: Int, coms: MutableList<String>){
        if(com.length==(2*n)){
            coms.add(com)
            //println(com)
        }
        if(opCount <n){
            // com= com + "("
            dfs(opCount+1, clCount, com + "(", n, coms)
        }
        if(clCount< opCount){
            // com=com+")"
            dfs(opCount, clCount+1, com+")", n, coms)
        }
    }

    fun generateParenthesis(n: Int): List<String> {
        var result = mutableListOf<String>()
        var opCount = 0
        var clCount = 0
        var com=""
        dfs(opCount, clCount, com, n, result)
        
        //println(result)
        return result
    }
}
