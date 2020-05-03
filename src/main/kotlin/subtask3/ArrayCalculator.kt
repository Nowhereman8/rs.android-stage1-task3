package subtask3
import kotlin.math.absoluteValue
import kotlin.collections.filter

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {

        var n = numberOfItems
        var listok = itemsFromArray.filterIsInstance<Int>().toMutableList()
        if (listok.size == 0) {
            return(0)
        } else {
            listok.sortBy { it.absoluteValue }
            listok.reverse()
            println(listok)

            var prod = listok.take(n)
            var res = prod[0]
            for (i in 1..prod.size - 1) {
                res *= prod[i]
            }
            //println(prod)

            while (listok.size > n && res < 0) {
                prod = listok.take(n)
                //println(prod)
                res = prod[0]
                for (i in 1..prod.size - 1) {
                    res *= prod[i]
                }
                //println(prod)
                if (prod.filter { it < 0 }.size > 0) {
                    var el = listok.lastOrNull { it < 0 }
                    //println(el)
                    listok.removeAt(listok.indexOf(el))
                    //println(listok)
                }
            }
            return res
        }

    }
}
