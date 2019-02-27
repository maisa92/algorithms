package test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import search.LinearSearch

internal class LinearSearchTest{


    @Test
    fun `Search int array contains one element` (){
        val linearSearch  = LinearSearch<Int>(arrayOf(1, 2, 3, 4, 5, 6))
        val returnValue = linearSearch.search(3);
        assertEquals(2,returnValue)
    }

    @Test
    fun `Search int array must return -1` (){
        val linearSearch  = LinearSearch<Int>(arrayOf(1, 2, 3, 4, 5, 6))
        val returnValue = linearSearch.search(8);
        assertEquals(-1,returnValue)
    }

    @Test
    fun `Search string array contains one element` (){
        val linearSearch  = LinearSearch<String>(arrayOf("azo", "chxarto", "Jinchvela", "MaIsa"))
        val returnValue = linearSearch.search("azo");
        assertEquals(0,returnValue)
    }

    @Test
    fun `Search string array contains one element with UpperCase` (){
        val linearSearch  = LinearSearch<String>(arrayOf("azo", "chxarto", "Jinchvela", "MaIsa"))
        val returnValue = linearSearch.search("jinchvela");
        assertEquals(-1,returnValue)
    }
}