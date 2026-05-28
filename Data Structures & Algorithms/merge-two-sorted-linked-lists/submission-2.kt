/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var temp1 = list1
        var temp2 = list2 
        val combined = ListNode(0)
        var curr = combined
        
        while(temp1!=null || temp2!=null){
                println("2nd ${combined?.`val`} ${temp1?.`val`}_${temp2?.`val`}")
                if(temp1==null){
                    curr.next = temp2
                    temp2 = temp2?.next
                    curr = curr.next!!
                    continue
                }
                if(temp2==null){
                    curr.next = temp1
                    temp1 = temp1?.next
                    curr = curr.next!!
                    continue
                }
               if(temp1.`val` < temp2.`val`){
                    curr.next = temp1
                    temp1 = temp1?.next
                } else {
                    curr.next = temp2
                    temp2 = temp2?.next
                } 
                curr=curr.next!!
        }
        return combined.next
    }
}
