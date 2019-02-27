package search

class LinearSearch<T>(a: Array<T>) {


// The Time complexity  is O(n)
//
    private val array : Array<T> = a

    fun search(x : T): Int {
        var returnResult : Int = -1
        for (i in 0 until array.size){
            if (array[i] == x){
                returnResult = i
                break
            }
        }
        return  returnResult
    }
}