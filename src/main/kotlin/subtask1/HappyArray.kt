package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
       var i = 1
       var n = 0
       var happyArr = sadArray
        n = happyArr.size
        while (n-1 > i)
        {
            if (happyArr[i]>happyArr[i-1]+happyArr[i+1])
            {
                while (n-1 > i)
                {
                    happyArr[i] = happyArr[i+1]
                    i = i+1
                }
                i = 1
                n = n-1
            }
            else
            i++
        }
        i=0
        var hapArr = IntArray (n, {0})
        while (i<n)
        {
            hapArr[i] = happyArr[i]
            i++
        }
        return hapArr

        throw NotImplementedError("Not implemented")
    }
}
