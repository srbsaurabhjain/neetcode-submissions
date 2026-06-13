/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var result = mutableListOf<List<Int>>()
        if(root==null) return result

        var queue= ArrayDeque<TreeNode>()
        queue.add(root)

        while(queue.size!=0){
            val qLen = queue.size
            var level = mutableListOf<Int>()
            for (i in 0..qLen-1){
                //println(qLen)
                val node = queue.removeFirst()
                if(node!=null){
                    level.add(node.`val`)
                    if(node.left!=null) queue.add(node.left)
                    if(node.right!=null) queue.add(node.right)
                }
                //println("level: $level")
            }
            result.add(level)
            //println("result: $result, level: $level, qLen: $qLen")
        }

        return result
    }
}
