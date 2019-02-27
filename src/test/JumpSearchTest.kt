package test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import search.JumpSearch

class JumpSearchTest {

    @Test
    fun `Search int array contains one element at six position` (){
        val jumpSearch  = JumpSearch()
        val returnValue = jumpSearch.search(7, arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Assertions.assertEquals(6, returnValue)
    }


    @Test
    fun `Search int array contains one element no element` (){
        val jumpSearch  = JumpSearch()
        val returnValue = jumpSearch.search(11, arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Assertions.assertEquals(-1, returnValue)
    }


    @Test
    fun `Search int array contains two element` (){
        val jumpSearch  = JumpSearch()
        val returnValue = jumpSearch.search(5, arrayOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9));
        Assertions.assertEquals(4, returnValue)
    }

    @Test
    fun `Search int array last element` (){
        val jumpSearch  = JumpSearch()
        val returnValue = jumpSearch.search(9, arrayOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9));
        Assertions.assertEquals(9, returnValue)
    }





}