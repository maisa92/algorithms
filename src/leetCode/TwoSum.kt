package leetCode

class TwoSum {


    // n2
    fun twoSum(nums: IntArray, target: Int): IntArray{
        var firstNumber : Int
        for (i in 0..nums.size-1) {

            firstNumber = target - nums[i]
            for (j in i+1..nums.size-1){
                if(nums[j] == firstNumber){
                    return intArrayOf(i,j)
                }
            }

        }
        return intArrayOf(-1)
    }


    fun twoSumHashMap(nums: IntArray, target: Int): IntArray{
        val map : HashMap<Int, ArrayList<Int>> = HashMap()
        for (i in 0..nums.size-1) {
            if(map.contains(nums[i])) {
                val array = map[nums[i]]
                array!!.add(i)
              //  map.put(nums[i], array)
            }
            else
                map.put(nums[i], arrayListOf(i))
        }

        for (i in 0..nums.size-1){
            val secondNumber  = target - nums[i]

            if(secondNumber != nums[i]) {
                if (map.contains(secondNumber))
                    return intArrayOf(i, map[secondNumber]!!.first())
            }else{
                if (map.contains(secondNumber) && map[secondNumber]!!.count() > 1)
                    return intArrayOf(i, map[secondNumber]!![1])
            }

        }
        return intArrayOf(-1)
    }
}