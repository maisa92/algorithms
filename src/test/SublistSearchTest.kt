package test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import search.LinkedListForSubListSearch
import search.Node
import search.SublistSearch


class SublistSearchTest {

    @Test
    fun `first linked List Contains second one`() {
        val node1 = createNode(arrayOf(1, 2, 3, 4, 5, 6))
        val node2 = createNode(arrayOf(2, 3, 4))
        val sublistSearch: SublistSearch = SublistSearch()
        val returnValue = sublistSearch.search(node2, node1)
        Assertions.assertEquals(true, returnValue)
    }

    @Test
    fun `equal linkedlist`() {
        val node1 = createNode(arrayOf(1, 2, 3, 4, 5, 6))
        val node2 = createNode(arrayOf(1, 2, 3, 4, 5, 6))
        val sublistSearch: SublistSearch = SublistSearch()
        val returnValue = sublistSearch.search(node2, node1)
        Assertions.assertEquals(true, returnValue)
    }

    @Test
    fun `first node doesn't  contain second node `() {
        val node1 = createNode(arrayOf(1, 2, 3, 4, 5, 6))
        val node2 = createNode(arrayOf(2, 3, 5))
        val sublistSearch: SublistSearch = SublistSearch()
        val returnValue = sublistSearch.search(node2, node1)
        Assertions.assertEquals(false, returnValue)
    }


    fun createNode(arr: Array<Int>): Node? {
        val list = LinkedListForSubListSearch()
        for (i in arr) {
            list.insert(i)
        }

        return list.head
    }


}