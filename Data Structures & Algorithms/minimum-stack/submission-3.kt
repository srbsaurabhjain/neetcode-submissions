class MinStack() {
    var stack = ArrayDeque<Int>()
    var min = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        if(min.size==0) min.add(`val`)
        else{
            val minimum = minOf(min.last(), `val`)
            min.add(minimum)
        }
    }

    fun pop() {
        stack.removeLast()
        min.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return min.last()
    }
}
