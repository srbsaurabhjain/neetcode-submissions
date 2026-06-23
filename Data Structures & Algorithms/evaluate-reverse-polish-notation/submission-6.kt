class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        var result = 0
        var queue = ArrayDeque<Int>()
        for(i in tokens){
            if(i.toIntOrNull() != null){
                queue.add(i.toInt())
            } else{
                val b = queue.removeLast()
                val a = queue.removeLast()
                val res = when(i){
                    "+"->a+b
                    "-"->a-b
                    "*"->a*b
                    "/"->a/b
                    else->0
                }
                queue.add(res)
                println("i: $i, a: $a,  b:$b, res:$res")
            }
            
            
        }
        return queue.last()
    }
}
