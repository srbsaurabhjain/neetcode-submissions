/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        var temp = head
        var nodeMap = mutableMapOf<Node, Node>()
        while(temp!=null){
            println("${temp.`val`}, ${temp?.random?.`val`} ")
            nodeMap[temp] = Node(temp.`val`)
            temp=temp.next
        }

        for(i in nodeMap.keys){
            nodeMap[i]?.next = nodeMap[i.next]
            nodeMap[i]?.random = nodeMap[i.random]
        }
        return nodeMap.values.firstOrNull()
    }
}
