fun main() {
    val nums = arrayOf(11, 16, 7, 8, 14, 5, 9, 3)
    var avg = 0f
    for (i in nums)
        avg += i
    avg /= nums.size
    print("Average = $avg")
}
