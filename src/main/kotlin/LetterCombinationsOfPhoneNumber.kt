fun main() {
    val digits = "234"
    println(letterCombinations(digits))

}

fun letterCombinations(digits: String): List<String> {
    val lettersOfDigits = hashMapOf<Char, CharArray>(
        '2' to charArrayOf('a', 'b', 'c'),
        '3' to charArrayOf('d', 'e', 'f'),
        '4' to charArrayOf('g', 'h', 'i'),
        '5' to charArrayOf('j', 'k', 'l'),
        '6' to charArrayOf('m', 'n', 'o'),
        '7' to charArrayOf('p', 'q', 'r', 's'),
        '8' to charArrayOf('t', 'u', 'v'),
        '9' to charArrayOf('w', 'x', 'y', 'z'),

    )

    val result = mutableListOf<String>()

    digits.toCharArray()

//    for (i in digits.indices) {
//        lettersOfDigits[digits[i]]?.forEach {
//            var stringBuilder = java.lang.StringBuilder()
//            stringBuilder.append(it)
//            result.add(stringBuilder.toString())
//        }
//    }

    lettersOfDigits[digits[0]]?.forEach { it0 ->
        lettersOfDigits[digits[1]]?.forEach { it1 ->
            lettersOfDigits[digits[2]]?.forEach { it2 ->
                var stringBuilder = java.lang.StringBuilder()
                stringBuilder.append(it0).append(it1).append(it2)
                result.add(stringBuilder.toString())

            }
        }
    }

    return result
}

