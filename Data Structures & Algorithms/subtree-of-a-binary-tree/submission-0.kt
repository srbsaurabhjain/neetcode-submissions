/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    fun dfs(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root==null && subRoot==null){
            return true
        }
        if(root?.`val`!= subRoot?.`val`) return false

        println("root: ${root?.`val`} subroot: ${subRoot?.`val`}")
        val left = dfs(root?.left, subRoot?.left)
        val right = dfs(root?.right, subRoot?.right)
        if(left && right){
            return true
        }
        return false
        
    }

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(subRoot==null) return true
        if (root == null) return false
        if (dfs(root, subRoot)) return true
        // dfs(root, subRoot)
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }
}
