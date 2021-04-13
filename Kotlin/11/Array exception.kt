fun main() {
    val nums = arrayOf(4, 2, 6, 19)
    try {
        print(nums[7])
    } catch (e: ArrayIndexOutOfBoundsException) {
        print("Element not found. Index out of bounds")
    }
}