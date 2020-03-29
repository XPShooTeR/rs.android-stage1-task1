package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var i = 0
        var sum = 0
        var resul = 0
        val n = bill.size
        val fraze = "bon appetit"
        while (i<n)
        {
            if (i != k) sum = sum + bill[i]
            i++
        }
        if ((sum/2) == b)
        {
            return fraze
        }
        else
        {
            resul = b - sum/2
            return resul.toString()
        }
        throw NotImplementedError("Not implemented")
    }
}
