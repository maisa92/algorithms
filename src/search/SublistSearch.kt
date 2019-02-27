package search

class SublistSearch {
    fun search(first: Node?, second: Node?): Boolean {

        var fir = first
        var sec = second

        if (first == null && second == null)
            return true

        while (sec != null && fir != null) {

            if (sec.data == fir.data) {
                fir = fir.next
            } else {
                fir = first
            }

            if (fir == null)
                return true

            sec = sec.next
        }

        return false
    }
}



class LinkedListForSubListSearch{

     var head :Node? = null

    fun insert (x : Int){
       val node = Node(null, x)

        if (head == null){
            head = node
        }else {
            var n = head
            while (n!!.next != null) {
                n = n.next
            }
            n.next = node
        }
    }
}


class Node(var next: Node?, var data: Int?) {


}