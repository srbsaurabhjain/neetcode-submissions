/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var size = 0
        var temp1 = head
        while(temp1!=null){
            temp1=temp1.next
            size++
        }        
        
        println(size)

        var remove = size-n+1
        var count=1
        var temp = head
        if(remove==1){
            return head?.next
        }
        while(temp!=null){
            println("$count, ${temp.`val`}")
            if(count==remove-1){
                temp.next = temp.next?.next
            } else {
                temp = temp.next
            }
            count++
        }
        return head
    }
}
