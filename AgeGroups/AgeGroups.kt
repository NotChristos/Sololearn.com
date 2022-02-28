fun main(args: Array<String>) {
    println("How old are you?")
    val age = readLine()!!.toInt()

    val result = when {
        age in 0..11 -> "Child!"
        age in 12..17 -> "Teen!"
        age in 18..64 -> "Adult!"
        age < 0 -> "Invalid age"
        else -> "Senior!"
    }
    println(result) // kotlin.Unit
}
