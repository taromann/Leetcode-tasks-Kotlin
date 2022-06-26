import java.util.*
import kotlin.math.abs

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val nums1 = intArrayOf(3, 2, 4)
    val target1 = 6

    val nums2 = intArrayOf(3, 3)
    val target2 = 6

    println(twoSum(nums, target)?.forEach { println(it) })
    println(twoSum(nums1, target1)?.forEach { println(it) })
    println(twoSum(nums2, target2)?.forEach { println(it) })
}

fun twoSum(nums: IntArray, target: Int): IntArray? {
    nums.filter { it <= target }.run {
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] + nums[j] == target && i != j) return intArrayOf(i, j)
            }
        }
    }
    return null

}