package test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import search.FibonacciSearch

class FibonacciSearchTest {

    @Test
    fun `Search int array contains one element at five position` (){
        val fibonacciSearch  = FibonacciSearch()
        val returnValue = fibonacciSearch.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 6);
        Assertions.assertEquals(5, returnValue)
    }

    @Test
    fun `Doesn't contain any element` () {
        val fibonacciSearch  = FibonacciSearch()
        val returnValue = fibonacciSearch.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 67);
        Assertions.assertEquals(-1, returnValue)
    }


}