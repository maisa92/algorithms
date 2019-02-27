package search

class JumpSearch {

    fun search(x : Int, arr : Array<Int>) : Int {
         val n = arr.size

         var prev = 0;
         var step =  Math.floor(Math.sqrt(n.toDouble())).toInt()


         while (arr[Math.min(step,n)-1] < x){
             prev = step
             step += step
             if (prev >= n)
                 return -1
         }

         while (arr[prev] != x){
             prev ++
             if(prev >= step)
                 return -1
         }

         return prev
    }
}