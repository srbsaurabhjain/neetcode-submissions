/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root==null){
            return root
        }
        val invertedLeft = invertTree(root?.left)
        val invertedRight = invertTree(root?.right)

        var newNode = TreeNode(root.`val`)
        newNode.left = invertedRight
        newNode.right = invertedLeft
        return newNode
    }
}
