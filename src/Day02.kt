





fun findValidIDs(input: List<String>): List<Int> {
    val validIDs = mutableListOf<Int>()
    input.forEach { if (isCubeSetValid(it)) { validIDs.add(parseID(it)) } }
    return validIDs
}

fun parseID(text: String): Int {
    return text.split(":").first().filter { it.isDigit() }.toInt()
}

fun isCubeSetValid(input: String): Boolean {
    val text = input.split(":").last().trim().split(";")
    text.forEach {
        val cube = mutableMapOf <String, Int> ("red" to 0, "green" to 0, "blue" to 0)
        it.split(",").forEach { s ->//  3 blue
            val color = s.filter { it.isLetter() }
            val amount = s.filter { it.isDigit() }.toInt()
            cube[color] = amount
        }
        if (!isCubeValid(cube)) return false
    }
    return true
}

fun isCubeValid(cube: Map<String, Int>): Boolean {
    return cube["red"]!! <= 12 && cube["green"]!! <= 13 && cube["blue"]!! <= 14
}

fun main() {
    fun part1(input: List<String>): Int {
        return findValidIDs(input).sum()
    }
    fun part2(input: List<String>): Int {
        return 0
    }

    val testInput1 = readInput("Day02_1_test")
    val input = readInput("Day02")

    check(part1(testInput1) == 8)

    part1(input).let(::println)


}