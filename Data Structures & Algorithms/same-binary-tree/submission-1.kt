/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var isSame = true

    fun dfs(p: TreeNode?, q: TreeNode?): Boolean {
        if(p==null && q==null){
            return true
        }

        if(p==null && q!=null){
            isSame = false
            return false
        }

        if(p!=null && q==null){
            isSame = false
            return false
        }

        if(p?.`val`!=q?.`val`){
            isSame = false
            return false
        }
        val left=dfs(p?.left, q?.left)
        val right=dfs(p?.right, q?.right)
        if(!left || !right){
            isSame = false
            return false
        } else return true
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return dfs(p,q)
     //   return isSame
    }
}
