fun main() {
    val strs = arrayOf("flower", "fl", "flowht")
    println(longestCommonPrefix(strs))

}

fun longestCommonPrefix(strs: Array<String>): String {
    val result = java.lang.StringBuilder()
    if (strs.isEmpty()) return ""
    val arrayOfArrs = strs.map { it.toCharArray() }
    arrayOfArrs[0].forEachIndexed { index, char ->
        for (i in 1 until arrayOfArrs.size) {
            if (index > arrayOfArrs[i].size - 1 || arrayOfArrs[i][index] != char) return result.toString()
        }
        result.append(char)
    }
    return result.toString()
}
