fun main(args: Array<String>) {
    println("Enter the first letter of the name:")
    val letter = readLine()!![0].uppercaseChar() //пользовательсий ввод с переводом Char в верхний регистр
    val names =
        arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")
    names.forEach { i ->
        if (i[0] == letter) println(i)
    }
}
