package search




class BinarySearch(storedArray: Array<Int>) {

    private val array = storedArray

    fun search(x: Int, first :Int =  0,  last : Int = array.size -1): Int {
         val middle = (first + last)/2
        if (x == array[middle])
            return middle

        if(x < array[middle])
            return search(x, 0, middle-1)
        else
            return search(x, middle+1, last)
    }
}