package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var mas = array

        for(x in 0 .. (mas[1]/2 )){
            if(mas[0]*fact(x)*fact(mas[1]-x) == fact(mas[1]))
                return x
        }
        return null
    }

    fun fact (n : Int): Int {
        when (n) {
            1 -> return 1
            0 -> return 1
            else -> {
                var res = 1
                for (i in 1..n) {
                    res *= i
                }
                return res
            }
        }
    }
}
