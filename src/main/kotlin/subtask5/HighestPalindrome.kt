package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val radius = if (n%2 == 1) (n-1)/2 else n/2
        var resItog = ""
        var res = digitString.toCharArray()
        var i = 0
        var countZ = 0
        var freeRepl = 0
        while (i < radius)
        {
            if (res[i] != res[n-i-1]) countZ++
            i++
        }
        if (countZ > k) return "-1"
        i = 0
        freeRepl = k - countZ
        while (i < radius)
        {
            if (res[i] != res[n-i-1])
            {
                if (res[i].toInt() > res[n - i - 1].toInt())
                    if (freeRepl == 0 || res[i].toInt() == 9) res[n - i - 1] = res[i]
                    else
                    {
                        res[i] = '9'
                        res[n-i-1] = '9'
                        freeRepl = freeRepl - 1
                    }
                else
                    if (freeRepl == 0 || res[n-i-1].toInt() == 9) res[i] = res[n - i - 1]
                    else
                    {
                        res[i] = '9'
                        res[n-i-1] = '9'
                        freeRepl = freeRepl - 1
                    }
            }
            else
                if (freeRepl > 1 && res[i].toInt() != 9)
                {
                    res[i] = '9'
                    res[n-i-1] = '9'
                    freeRepl = freeRepl - 2
                }
            i++
        }
        i = 0
        while (i < n)
        {
            resItog = resItog + res[i]
            i++
        }
        println(resItog)
        return resItog
        throw NotImplementedError("Not implemented")
    }
}
