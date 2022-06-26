fun main() {
    val x = 123
    println(reverse(x))
}

fun reverse(x: Int): Int {
    x.toString().toMutableList().asReversed().joinToString(separator = "").let { s ->
        if (s.contains('-', false)) {
            s.replace("-", "").let {
                try {
                    return it.toInt().unaryMinus()
                } catch (e: NumberFormatException) {
                    return 0
                }
            }
        }
        else try {
            return s.toInt()
        } catch (e: NumberFormatException) {
            return 0
        }
    }
}
