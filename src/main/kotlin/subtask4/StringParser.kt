package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var stk: Array<Array<Int>> = Array(2, { Array(20, {0}) })
        var result: Array<String> = Array(20){" "}
        var i = 0
        val n = inputString.length
        var j = 0
        var k = 0
        var l = 0
        var res = "  "
        var symb = inputString[0].toChar()
        var por: Array<Array<Int>> = Array(2, { Array(20, {0}) })
        var p = 0
        var pvrem = 0
        while (i<n)
        {
            symb = inputString[i].toChar()
            when (symb)
            {
                '(' -> {
                    stk[0][j] = 1
                    stk[1][j] = i
                    j++
                    por[0][p] = i
                    p++
                }
                '[' -> {
                    stk[0][j] = 2
                    stk[1][j] = i
                    j++
                    por[0][p] = i
                    p++
                }
                '<' -> {
                    stk[0][j] = 3
                    stk[1][j] = i
                    j++
                    por[0][p] = i
                    p++
                }
                ')' -> {
                    l = j
                    while (l > -1)
                    {
                        if (stk[0][l] == 1)
                        {
                            res = inputString.drop(stk[1][l]+1)
                            result[k] = res.dropLast(n-i)
                            pvrem = 0
                            while (pvrem < p+1)
                            {
                                if (por[0][pvrem] == stk[1][l]) por[1][pvrem] = k
                                pvrem++
                            }
                            k++
                            while (l < j)
                            {
                                stk[0][l] = stk[0][l+1]
                                stk[1][l] = stk[1][l+1]
                                l++
                            }
                            l = 0
                            j--
                        }
                        l--
                    }
                }
                ']' ->{
                    l = j
                    while (l > -1)
                    {
                        if (stk[0][l] == 2)
                        {
                            res = inputString.drop(stk[1][l]+1)
                            result[k] = res.dropLast(n-i)
                            pvrem = 0
                            while (pvrem < p+1)
                            {
                                if (por[0][pvrem] == stk[1][l]) por[1][pvrem] = k
                                pvrem++
                            }
                            k++
                            while (l < j)
                            {
                                stk[0][l] = stk[0][l+1]
                                stk[1][l] = stk[1][l+1]
                                l++
                            }
                            l = 0
                            j--
                        }
                        l--
                    }
                }
                '>' ->{
                    l = j
                    while (l > -1)
                    {
                        if (stk[0][l] == 3)
                        {
                            res = inputString.drop(stk[1][l]+1)
                            result[k] = res.dropLast(n-i)
                            pvrem = 0
                            while (pvrem < p+1)
                            {
                                if (por[0][pvrem] == stk[1][l]) por[1][pvrem] = k
                                pvrem++
                            }
                            k++
                            while (l < j)
                            {
                                stk[0][l] = stk[0][l+1]
                                stk[1][l] = stk[1][l+1]
                                l++
                            }
                            l = 0
                            j--
                        }
                        l--
                    }
                }
            }
            i++
        }
        var resultArr: Array<String> = Array(k){" "}
        i = 0
        while (i < k)
        {
            resultArr[i]=result[por[1][i]]
            i++
        }
        return resultArr
        throw NotImplementedError("Not implemented")
    }
}
