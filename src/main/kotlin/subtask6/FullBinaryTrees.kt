package subtask6

class FullBinaryTrees {

    inner class Node {
        var depth = 0
        var left: Node? = null
        var right: Node? = null
    }

    fun stringForNodeCount(count: Int): String {
        val g = generateTrees(count)
        val res = ArrayList<ArrayList<Int?>>()

        for (i in g) {
            val list1 = intoList(i)
            while (list1[list1.size - 1] == null) {
                list1.removeAt(list1.size - 1)
            }

            res.add(list1)
        }
        return res.toString()
    }

    fun generateTrees(n: Int): ArrayList<Node> {
        if (n % 2 == 0) return ArrayList()
        if (n == 1) return arrayListOf(Node())
        val res = ArrayList<Node>()
        for (i in 1..(n - 1) step 2) {
            val left = generateTrees(i)
            val right = generateTrees(n - 1 - i)
            for (ln in left) {
                for (rn in right) {
                    val root = Node()
                    root.left = ln
                    root.right = rn
                    root.depth = maxOf(ln.depth, rn.depth) + 1
                    res.add(root)
                }
            }
        }
        return res
    }

    private fun intoList (n: Node): ArrayList<Int?> {
        val res = ArrayList<Int?>()
        res.add(0)
        val gl = n.depth
        val chil = ArrayList<Node?>()
        chil.add(n.left)
        chil.add(n.right)
        var currentLevel = 0
        while (chil.isNotEmpty()) {
            val newChil = ArrayList<Node?>()
            for (c in chil) {
                if (c == null) {
                    if (currentLevel != gl) res.add(null)
                } else {
                    res.add(0)
                    newChil.add(c.left)
                    newChil.add(c.right)
                }
            }
            chil.clear()
            chil.addAll(newChil)
            newChil.clear()
            currentLevel++
        }
        return res
    }
}