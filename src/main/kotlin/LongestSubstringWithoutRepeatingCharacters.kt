fun main() {
    val s1 = "dvdf"
    val s2 = "bbbbb"
    val s3 = "pwwkew"
    val s4 = " "
    val s5 = "ua"
//
    println(lengthOfLongestSubstring(s1))
    println(lengthOfLongestSubstring(s2))
    println(lengthOfLongestSubstring(s3))
    println(lengthOfLongestSubstring(s4))
    println(lengthOfLongestSubstring(s5))

}

fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = 0
    val currentSubstring = mutableSetOf<Char>()
    val stringArray = s.toCharArray()
    stringArray.forEachIndexed { index, _ ->
        currentSubstring.clear()
        var newIndex = index
        while (currentSubstring.add(stringArray[newIndex]) && newIndex < stringArray.size - 1) {
            newIndex++
        }
        if (currentSubstring.size > maxLength) maxLength = currentSubstring.size
    }
    return maxLength
}