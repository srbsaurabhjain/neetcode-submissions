/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var curr = head
        var prev: ListNode? = null
        var next: ListNode?

        while(curr!=null){
            next=curr.next
            println("${curr.next?.`val`}")
            curr.next=prev
            prev=curr
            curr=next
        }
        return prev
    }
}
