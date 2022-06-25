import java.util.*

fun main() {
    val romanValues: Map<Char, Int> =
        mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    val scanner = Scanner(System.`in`)
    while (true) {
        val input = scanner.next()
        var result = 0
        input.toCharArray().run {
            var i = 0
            while (i < this.size) {
                var currentNumber = if (this.getOrNull(i + 1) != null && this[i] in setOf('I', 'X', 'C') && romanValues[this[i + 1]]!! > romanValues[this[i]]!!) {
                    val currentRomanNumber = this[i]
                    val nextRomanNumber = this[i + 1]
                    i+=2
                    romanValues[nextRomanNumber]!! - romanValues[currentRomanNumber]!!
                } else {
                    val currentRomanNumber = this[i]
                    i++
                    romanValues[currentRomanNumber]!!
                }
                println("currentNumber $currentNumber")
                result += currentNumber
            }
        }

        println("result $result")

    }

}


