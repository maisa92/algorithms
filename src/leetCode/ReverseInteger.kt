package leetCode

import kotlin.math.sin

class ReverseInteger {

    fun reverse(x: Int) : Int {

        val string = x.toString()
        val array : CharArray = charArrayOf('0','1','2','3','4','5','6','7','8','9')

        var output: String = ""
        for (c in   string.count() -1 downTo 0) {
            if(array.contains(string[c]))
                output += string[c]
            else
                output = string[c].toString() + output
        }
        return   if(output.toIntOrNull() == null)  0 else output.toInt()
     }



    fun reverseSecond(x: Int) : Int {
        if (x == 0)
            return 0
        val sign : Int
        var  temp : Long
        val xx = x.toLong()
        if(xx < 0) {
            sign = -1
            temp = xx * -1
        }
        else {
            sign = 1
            temp = xx
        }


        var returnValue : Long = 0


        while (temp / 10 != 0.toLong()){

            returnValue = returnValue * 10 + temp % 10

                temp /= 10

        }

        returnValue = if((returnValue * 10 + temp)  < 2147483647) (returnValue * 10 + temp) * sign else 0

        return returnValue.toInt()
    }
}