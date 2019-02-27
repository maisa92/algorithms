package leetCode

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val charArray = s.toCharArray()
        var isValid = true
        val stack = Stack<Char>()

        for (c in 0 until charArray.size) {
            if (openSymbols(charArray[c])) {
                stack.push(charArray[c])
            }else{
                if(!stack.empty() && getSymbolsInt(charArray[c]) == getSymbolsInt(stack.peek())){
                         stack.pop()
                }else
                {
                    isValid = false
                    break
                }
            }
        }

        if(!stack.empty())
            isValid = false

        return isValid
    }


    private fun getSymbolsInt(c : Char) : Int {
        val dictionary  = HashMap<Char,Int>()
        dictionary['('] = 1
        dictionary[')'] = 1
        dictionary['{'] = 2
        dictionary['}'] = 2
        dictionary['['] = 3
        dictionary[']'] = 3

        return dictionary[c]!!

    }

    private fun openSymbols(c : Char): Boolean{
        val dictionary  = HashMap<Char,Int>()
        dictionary['('] = 1
        dictionary['{'] = 2
        dictionary['['] = 3

        return dictionary[c] != null


    }



}