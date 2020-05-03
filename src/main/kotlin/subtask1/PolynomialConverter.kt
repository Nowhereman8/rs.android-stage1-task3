package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        var n = numbers
        //var n = num.toMutableList()

        var pol = ""
        if (n.size == 0) {
            return null
        } else {
            if (n.size == 1) {
                return n[0].toString()
            } else {
                if (n.size == 2) {
                    when (n[0]) {
                        1 -> pol += "x"
                        -1 -> pol += "- x"
                        0 -> pol += ""
                        else -> {
                            if (n[0] > 0){
                                pol += n[0].toString() + "x"
                            } else {
                                pol += "- " + (n[0]*(-1)).toString() + "x"
                            }
                        }
                    }
                    if (n[1] > 0) {pol += " + " + n[1].toString()} else {pol += " - " + (n[1]*(-1)).toString()}
                } else {
                    // первый элемент в начало all результата
                    if (n[0] > 0) {
                        when (n[0]) {
                            0 -> pol += ""
                            1 -> pol += "x^" + (n.size - 1).toString()
                            else -> pol += n[0].toString() + "x^" + (n.size - 1).toString()
                        }
                    } else {
                        when (n[0]) {
                            0 -> pol += ""
                            -1 -> pol += "- " + "x^" + (n.size - 1).toString()
                            else -> pol += "- " + n[0].toString() + "x^" + (n.size - 1).toString()
                        }
                    }
// с первым разобрались, теперь если их больше 2 работает этот код
                    for (i in 1..n.size - 1) {
                        if (n[i] > 0) {
                            //>0
                            when (n[i]) {
                                1 -> {
                                    when (n.size - 1 - i) {
                                        0 -> pol += " + " + n[i].toString()
                                        1 -> pol += " + " + "x"
                                        else -> pol += " + " + "x^" + (n.size - 1 - i).toString()
                                    }
                                }
                                else -> {
                                    when (n.size - 1 - i) {
                                        0 -> pol += " + " + n[i].toString()
                                        1 -> pol += " + " + n[i].toString() + "x"
                                        else -> pol += " + " + n[i].toString() + "x^" + (n.size - 1 - i).toString()
                                    }
                                }
                            }
                        } else {
                            if (n[i] < 0) {
                                // <0
                                when (n[i]) {
                                    -1 -> {
                                        when (n.size - 1 - i) {
                                            0 -> pol += " - " + (n[i] * (-1)).toString()
                                            1 -> pol += " - " + "x"
                                            else -> pol += " - " + "x^" + (n.size - 1 - i).toString()
                                        }
                                    }
                                    else -> {
                                        when (n.size - 1 - i) {
                                            0 -> {
                                                pol += " - " + (n[i] * (-1)).toString()
                                            }
                                            1 -> {
                                                pol += " - " + (n[i] * (-1)).toString() + "x"
                                            }
                                            else -> pol += " - " + (n[i] * (-1)).toString() + "x^" + (n.size - 1 - i).toString()
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var pol2 = ""
        if (pol[0] == ' ' ) {
            pol2 = pol.drop(3)
            return (pol2)
        } else {
            if (pol[0] == '-' || pol[0] == '+') {
                pol2 = pol.drop(2)
                (return(pol2))
            } else return(pol)
        }
    }
}
