fun main() {
    val x = 1325230
    println(isPalindrome(x))
}

fun isPalindrome(x: Int): Boolean {
    val charArr = x.toString().toCharArray()
    var i: Int = if (charArr.size % 2 == 0) charArr.size / 2 else charArr.size / 2 + 1
    var j: Int = (charArr.size / 2) - 1

    while (i < charArr.size && j >= 0) {
        if (charArr[i++] != charArr[j--]) return false
    }
    return true
}
