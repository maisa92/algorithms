package search

class FibonacciSearch {

    fun search(arr: Array<Int>, x: Int): Int {
        val n = arr[arr.size - 1]
        var f1 = 0
        var f2 = 1
        var fm = f1 + f2

        while (fm < n) {
            f1 = f2
            f2 = fm
            fm = f1 + f2
        }

        var offset = -1

        while (fm > 1) {
            val i = Math.min(offset + f1, n - 1)

            if (arr[i] < x) {
                fm = f1
                f2 -= f1
                f1 = fm - f2
                offset = i
            } else if (arr[i] > x) {
                fm = f2
                f2 = f1
                f1 = fm - f2
            } else return i
        }
        if (f2 == 1 && arr[offset + 1] == x)
            return offset + 1

        return -1
    }
}