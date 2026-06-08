/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var balanced = true
    fun dfs(root: TreeNode?): Int {
        if(root==null){
            return 0
        }

        val left = dfs(root.left)
        val right = dfs(root.right)
        if(right-left>1 || left-right>1) balanced=false
        println(" node=${root?.`val`}, left=$left, right=$right")
        return 1 + max(left,right)
    }

    fun isBalanced(root: TreeNode?): Boolean {
        dfs(root)
        return balanced
    }
}
