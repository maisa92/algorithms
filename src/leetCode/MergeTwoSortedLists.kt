package leetCode

class MergeTwoSortedLists {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?) : ListNode? {
        if(l1 == null && l2 == null)
            return null

        if(l1 == null)
            return l2

        if(l2 == null)
            return l1


        var list1 =l1
        var list2 = l2
        var listNode : ListNode


        if(list1.`val` >= list2.`val` ) {
            listNode = ListNode(list2.`val`)
            list2 = list2.next
        }else{
            listNode = ListNode(list1.`val`)
            list1 = list1.next
        }

        while (list1 != null && list2 != null){

            if(list1.`val` >= list2.`val`) {
                 val tempListNode = ListNode(list2.`val`)
                 tempListNode.next  = listNode
                listNode = tempListNode
                 list2 = list2.next
            }else {
                val tempListNode = ListNode(list1.`val`)
                tempListNode.next  = listNode
                listNode = tempListNode
                list1 = list1.next
            }

        }

        if(list1 != null){
            while (list1 != null){
                val tempListNode = ListNode(list1.`val`)
                tempListNode.next  = listNode
                listNode = tempListNode
                list1 = list1.next
            }
        }else {
            while (list2 != null){
                val tempListNode = ListNode(list2.`val`)
                tempListNode.next  = listNode
                listNode = tempListNode
                list2 = list2.next
            }
        }


return listNode

}

}

  class ListNode(var `val`: Int) {
          var next: ListNode? = null
      }


