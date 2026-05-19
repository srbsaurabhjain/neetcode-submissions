class MinStack() {
    var stack = ArrayDeque<Int>()
    var minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        if(minStack.isEmpty()) minStack.add(`val`)
        else {
            val min = minOf(minStack.last(), `val`)
            minStack.add(min)
        }
    }

    fun pop() {
        stack.removeLast()
        minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}
