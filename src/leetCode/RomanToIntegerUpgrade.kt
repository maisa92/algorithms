package leetCode

import java.lang.Exception

class RomanToIntegerUpgrade {

    fun changeRomanToInt(str: String): Int {

        val charArray = str.toCharArray()

        var tempInt : Int = 0
        var oldChar : Char  = '-'

      //  val array : MutableList<Int> = mutableListOf<Int>()
        for (c in   charArray.count()-1 downTo 0) {
            tempInt = minusOrPlus(tempInt,oldChar, charArray[c])
            oldChar = charArray[c]
        }
        return  tempInt
    }

    private fun minusOrPlus(x: Int, oldC : Char, newC : Char): Int {
        if (oldC == '-')
            return getIntegerByRomanChar(newC)

        var returnInt : Int = x
        val oldInt = getIntegerByRomanChar(oldC)
        val newInt = getIntegerByRomanChar(newC)

        if(oldInt > newInt)
            returnInt -= newInt
        else{
            returnInt += newInt
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

        return dictionary[c]!!
    }
}