import java.util.ArrayList

class Stack<T>(val size: Int) {

    var a = ArrayList<T>(size)
    private var top: Int = -1


    fun push(x: T): Unit {
        if (top >= size) throw StackOverflowError() else {
            top++
            a.add(top,x)
        }
    }

    fun pop(): T? {
        if (top < 0) throw StackOverflowError() else {
            val xx: T? = a[top]
            top--
            return xx
        }
    }

    fun isEmpty(): Boolean = top < 0

}