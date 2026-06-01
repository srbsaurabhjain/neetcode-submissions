/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var temp = head
        var list = mutableListOf<ListNode?>()
        while(temp!=null){
            if(list.contains(temp?.next)){
                return true
            }
            list.add(temp?.next)
            temp = temp.next
        }
        println(list)
        return false
    }
}
