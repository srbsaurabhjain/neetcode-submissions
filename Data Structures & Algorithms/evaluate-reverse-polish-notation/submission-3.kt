class Solution {
    fun evalRPN(tokens: Array<String>): Int {
    val num = ArrayDeque<Int>()
    
    for(i in tokens){
        if(i.toIntOrNull()!=null){
            //println(i)
            num.add(i.toInt())
        } else {
                val b = num.removeLast()
                val a = num.removeLast()
                //println(""+a+i+b)
                val res = when(i){
                    "+" -> a+b
                    "-" -> a-b
                    "*" -> a*b
                    "/" -> a/b
                    else -> 0
                } 
                num.add(res)
            }
        }
    return num.last()

    }
}
