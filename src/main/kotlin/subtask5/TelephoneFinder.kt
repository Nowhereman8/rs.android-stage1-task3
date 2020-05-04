package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        val n = number
        val res = mutableListOf<String>()
        val m = n.toMutableList()

        if (n.toInt() < 0) {
            return null
        } else {
            for (i in 0..m.size - 1) {
                when (m[i]) {
                    '1' -> {
                        m[i] = '2'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '4'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '1'
                    }
                    '2' -> {
                        m[i] = '1'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '3'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '5'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '2'
                    }
                    '3' -> {
                        m[i] = '2'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '6'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '3'
                    }
                    '4' -> {
                        m[i] = '1'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '5'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '7'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '4'
                    }
                    '5' -> {
                        m[i] = '2'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '6'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '4'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '8'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '5'
                    }
                    '6' -> {
                        m[i] = '3'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '5'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '9'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '6'
                    }
                    '7' -> {
                        m[i] = '4'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '8'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '7'
                    }
                    '8' -> {
                        m[i] = '5'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '7'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '9'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '0'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '8'
                    }
                    '9' -> {
                        m[i] = '6'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '8'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '9'
                    }
                    '0' -> {
                        m[i] = '8'
                        res.add(m.joinToString(separator = ""))
                        m[i] = '0'
                    }
                }
            }
        }
        return res.toTypedArray()
    }
}
