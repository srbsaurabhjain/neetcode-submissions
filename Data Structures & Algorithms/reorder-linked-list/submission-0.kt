/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var slow = head
        var fast = head
        while(fast?.next!=null){
            println("${slow?.`val`},${fast?.`val`}")
            slow = slow?.next
            fast = fast?.next?.next
        }
        println("${slow?.`val`},${fast?.`val`}")

        var half = slow?.next
        slow?.next=null

        // reverse the half
        var curr=half
        var next:ListNode?
        var prev: ListNode?=null
        while(curr!=null){
            next=curr.next
            curr.next=prev
            prev=curr
            curr=next
        }

        var list1 = head
        var list2 = prev
        var combined = list1
        var cur = combined
        var count=1
        list1 = list1?.next
        while(list1!=null || list2!=null){
            if(count%2!=0 && list2!=null){
                println("extract list2")
                cur?.next = list2
                list2=list2?.next
            } else {
                println("extract list1")
                cur?.next = list1
                list1 = list1?.next
            }
            cur = cur?.next
            count++
        }
        while(combined!=null){
            println("combined ${combined?.`val`}")
            combined = combined.next
        }
        return
    }
}
