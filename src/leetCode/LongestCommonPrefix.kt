package leetCode

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {

        if (strs.count() == 0)
            return ""

        if(strs.count() == 1)
            return strs.first()

        strs.sort()
        val string = strs.minBy { x -> x.length }!!
        var returnString = ""
        var char = '-'
        var equal = true
        var index = 0


        for (c in 0 until  string.count()){

            char = '-'

            for (str in strs) {


                if (char ==  '-') {
                    char = str[index]
                    continue
                }

                if(str[index] != char){
                    equal = false

                    break
                }
            }

            index ++
            if (equal)
                returnString += if (char == '-' ) "" else char

        }

        return returnString
    }



    fun longestCommonPrefixUpgrade(strs: Array<String>): String {
        if(strs.count() == 0)
                return ""

        var string = strs.minBy { x -> x.length }!!

        for (str in strs) {
            var prefix = ""
            for (c  in 0 until  string.count()) {
                if(str[c] != string[c])
                    break

                prefix += str[c]
            }
            string = prefix
        }

        return string
    }
}