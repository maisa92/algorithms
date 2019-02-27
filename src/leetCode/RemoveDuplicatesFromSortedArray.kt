package leetCode

class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {

        if(nums.isEmpty())
                return 0;

        if(nums.size ==1)
            return 1


        var len = 0
        var last : Int? = null

        for (i in 0 until  nums.size){
            if(nums[i] != last){
                len ++
                last = nums[i]
            }
        }

        return len
    }
}