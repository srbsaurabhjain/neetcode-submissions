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
        var combined: ListNode? = null
        var combinedHead: ListNode? = null
        
        while(temp1!=null || temp2!=null){
            if(combined==null){
                println("1st ${temp1?.`val`}_${temp2?.`val`}")
                if(temp1==null){
                    combined = temp2
                    temp2 = temp2?.next
                    combinedHead = combined
                    continue
                }
                if(temp2==null){
                    combined = temp1
                    temp1 = temp1?.next
                    combinedHead = combined
                    continue
                }
                if(temp1.`val` < temp2.`val`){
                    combined = temp1
                    temp1 = temp1?.next
                    combinedHead = combined
                } else {
                    combined = temp2
                    temp2 = temp2?.next
                    combinedHead = combined
                }
            } else {
                println("2nd ${combined?.`val`} ${temp1?.`val`}_${temp2?.`val`}")
                if(temp1==null){
                    combined.next = temp2
                    temp2 = temp2?.next
                    combined = combined.next
                    continue
                }
                if(temp2==null){
                    combined.next = temp1
                    temp1 = temp1?.next
                    combined = combined.next
                    continue
                }
               if(temp1.`val` < temp2.`val`){
                    combined.next = temp1
                    temp1 = temp1?.next
                } else {
                    combined.next = temp2
                    temp2 = temp2?.next
                } 
                combined=combined.next
            }

        }
        return combinedHead
    }
}
