



fun main() {
    fun part1(input: List<String>): Int {

        return -1
    }

    fun part2(input: List<String>): Int {
        return -1
    }

    val input = readInput("Day09")
    val testInput = readInput("Day09_test")
    check(part1(testInput) == -1)
    check(part2(testInput) == -1)

    part1(input).println()
    part2(input).println()
}