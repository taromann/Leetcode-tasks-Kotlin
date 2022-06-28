fun main() {
    val height = intArrayOf(1,8,6,2,5,4,8,3,7)
    println(maxArea(height))
}

fun maxArea(height: IntArray): Int {
    var maxSquare = 0
    val heightsWithDistance = height.mapIndexed { index, i ->
        Pair(index, i)
    }.toList()

    for (i in heightsWithDistance.indices) {
        for (j in heightsWithDistance.indices) {
            val square =
                kotlin.math.abs(
                    heightsWithDistance[i].first - heightsWithDistance[j].first
                ) * minOf(heightsWithDistance[i].second, heightsWithDistance[j].second)
            if (square > maxSquare) {
                maxSquare = square
            }
        }
    }
    return maxSquare
}
