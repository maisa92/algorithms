class Queue<T>(val size : Int) {

    val a  = ArrayList<T>(size)
    var top = -1
    var i = 0


    fun push(x : T) : Unit{
        if(top >= size) throw StackOverflowError() else {
            top ++
            a.add(top,x)
        }
    }

    fun pop():T{
        if(top < 0) throw StackOverflowError()
        else{
            val xx = a[i]
            top --
            i++
            return  xx
        }
    }

    fun isEmpty() : Boolean = top < 0
}