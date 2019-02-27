package leetCode

import java.lang.Exception
import java.util.*
import kotlin.collections.HashMap

class RomanToInteger
{


    fun changeRomanToInt(str: String): Int {
        val string =  str.plus("+")
        val charArray = string.toCharArray()

        var tempInt : Int = 0
        var oldChar : Char  = '-'
        
        val array : MutableList<Int> = mutableListOf<Int>()
        for (c in charArray) {
              tempInt = minusOrPlus(tempInt,oldChar, c, array)
              oldChar = c
        }
           return addArray(array)
    }

    private fun minusOrPlus(x: Int, oldC : Char, newC : Char, array: MutableList<Int>): Int {
        var returnInt : Int = x
        if(oldC == newC || oldC == '-')
            returnInt += getIntegerByRomanChar(newC)
        else{
            array.add(returnInt)
            returnInt = if(newC == '+') 0 else getIntegerByRomanChar(newC)
        }

       return returnInt
    }
    
    private fun addArray(array: MutableList<Int>):Int{
        var returnInt : Int = array.last()

        for (i in   array.count()-1 downTo 0) {
            if(i == 0)
                continue

             if (array[i] > array[i-1])
                 returnInt -= array[i - 1]

            else
                 returnInt += array[i-1]
        }
        return returnInt
    }

    private fun getIntegerByRomanChar(c : Char): Int {
        val dictionary  = HashMap<Char,Int>()
        dictionary['I'] = 1
        dictionary['V'] = 5
        dictionary['X'] = 10
        dictionary['L'] = 50
        dictionary['C'] = 100
        dictionary['D'] = 500
        dictionary['M'] = 1000

        return if (dictionary[c] == null) throw Exception() else dictionary[c]!!
    }
}