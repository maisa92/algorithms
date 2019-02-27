class LinkedList<T>(size : Int) {
   var head : Node<T>? = null

    fun insert(x:T):Unit{
        val node : Node<T> = Node<T>(x,null)

        if (head == null)
            head = node
        else {
            var n  = head
            while (n!!.next != null){
                n = n.next
            }
            n.next = node

        }
    }


}


class Node<T>(var data: T, var next : Node<T>?){

}