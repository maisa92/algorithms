package test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import search.BinarySearch

class BinarySearchTest {
    @Test
    fun `Search int array contains one element` (){
        val linearSearch  = BinarySearch(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        val returnValue = linearSearch.search(3);
        assertEquals(2,returnValue)
    }

    @Test
    fun `Search int array contains two element` (){
        val linearSearch  = BinarySearch(arrayOf(1, 4, 6, 9, 15, 19, 22, 38, 38))
        val returnValue = linearSearch.search(38);

        assertEquals(7,returnValue)
    }

    @Test
    fun `Search int array contains two element starter` (){
        val linearSearch  = BinarySearch(arrayOf(1, 1, 4, 6, 9, 15, 19, 22, 38, 38))
        val returnValue = linearSearch.search(1);

        assertEquals(1,returnValue)
    }
}