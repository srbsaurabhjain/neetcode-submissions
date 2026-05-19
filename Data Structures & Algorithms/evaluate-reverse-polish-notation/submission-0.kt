class Solution {
    fun evalRPN(tokens: Array<String>): Int {
    val num = ArrayDeque<Int>()
    
    for(i in tokens){
        if(i.toIntOrNull()!=null){
            println(i)
            num.add(i.toInt())
        } else {
                val b = num.removeLast()
                val a = num.removeLast()
                println(""+a+i+b)
                var res = 0  
                if(i=="+"){
                    res = a+b

                } else if(i=="-"){
                    res = a-b

                } else if(i=="*"){
                    res = a*b

                } else if(i=="/"){
                    res = (a/b).toInt()
                }
                num.add(res)
            }
        }
    return num.last()

    }
}
