package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var max = input[0]
        var min = input[0]
        var sum = 0
        var i = 0
        var n = input.size
        while(i < n)
        {
            sum = sum+input[i]
            if (max<input[i]) max=input[i]
            if (min>input[i]) min=input[i]
            i++
        }
        var itogArr: IntArray = intArrayOf(sum-max,sum-min)
        return itogArr
        throw NotImplementedError("Not implemented")
    }
}
