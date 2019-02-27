package search

class ExponentialSearch {

    fun search(x: Int, arr: Array<Int>): Int {
        val n = arr.size - 1

        if (arr[0] == x)
            return 0

        var i = 1

        while (i < n && arr[i] < x) {
            i *= 2
        }

        return binarySearch(arr, i / 2, Math.min(i, n), x)
    }

    private fun binarySearch(arr: Array<Int>, fir: Int, last: Int, x: Int): Int {

        val mid = (last - fir) / 2

        if (arr[mid] == x)
            return mid

        if (arr[mid] < x)
            return binarySearch(arr, fir, mid-1, x)

        if (arr[mid] > x)
            return binarySearch(arr, mid+1, last, x)

        return -1
    }
}