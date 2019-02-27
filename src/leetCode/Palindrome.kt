package leetCode

class Palindrome {

    fun isPalindrome(x: Int): Boolean {
            if(x < 0)
                return false

       val reverseInt = reverse(x)
        return reverseInt == x
    }

    fun reverse(x: Int) : Int {
        if (x == 0)
            return 0

        var  temp : Long = x.toLong()
        var returnValue : Long = 0

        while (temp / 10 != 0.toLong()){
            returnValue = returnValue * 10 + temp % 10
            temp /= 10
        }

        returnValue = if((returnValue * 10 + temp)  < 2147483647) (returnValue * 10 + temp)   else 0

        return returnValue.toInt()
    }
}