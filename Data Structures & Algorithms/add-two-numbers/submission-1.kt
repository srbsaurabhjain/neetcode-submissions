/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var num1 = ""
        var temp1=l1
        while(temp1!=null){
            num1 = num1+temp1.`val`
            temp1 = temp1.next
        }

        var num2 = ""
        var temp2=l2
        while(temp2!=null){
            num2 = num2+temp2.`val`
            temp2 = temp2.next
        }

        println("$num1, $num2")
        println(" num1 reverse ${num1.reversed()}, ${num2.reversed()}")
        val sum = num1.reversed().toBigInteger() + num2.reversed().toBigInteger()
        println("hello")
        val reverse = sum.toString().reversed()
        println("reverse sum $reverse")

        // Create a linked list
        println(reverse[0].toString().toInt())
        val headNew = ListNode(reverse[0].toString().toInt())
        println(headNew.`val`)
        var sumN = headNew
        if(reverse.length>1){
            for(i in 1 ..(reverse.length)-1){
                sumN.next = ListNode(reverse[i].toString().toInt())
                sumN = sumN.next!!
            }
        }


        return headNew
    }
}
