fun main() {
    val nums1 = intArrayOf(1, 2)
    val nums2 = intArrayOf(3, 4)

    println(findMedianSortedArrays(nums1, nums2))

}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedArray = nums1 + nums2
    mergedArray.sortedArray().run {
        return if (this.size % 2 == 0) (this[this.size / 2] + this[this.size / 2 - 1]) * 1.0 / 2
        else this[this.size / 2] * 1.0
    }
}