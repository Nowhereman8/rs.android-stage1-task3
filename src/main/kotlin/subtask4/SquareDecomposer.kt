package subtask4

import java.lang.Math.floor
import java.lang.Math.sqrt


class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose( number - 1, number * number)
    }

    private fun decompose(n: Int, prod: Int): Array<Int>? {
        for (i in n downTo 1) {
            var ost = prod - i * i
            if (ost == 0) {
                return arrayOf(i)
            }

            if (ost < 0) {
                return null
            }

            var koren = floor( sqrt(ost.toDouble()) ).toInt()

            if (koren >= i) {
                koren = i - 1
            }

            var res = decompose(koren, ost)

            if (res != null) {
                return res + arrayOf(i)
            }
        }
        return null
    }
}
