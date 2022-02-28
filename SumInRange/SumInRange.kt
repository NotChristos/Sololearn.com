fun main(args: Array<String>) {
    val num1 = readLine()!!.toInt() // ввод 1-го числа
    val num2 = readLine()!!.toInt() // ввод 2-го числа
    var sum = 0

    for (init in num1..num2) {
        sum += init
    }
    println(sum) // вывод суммы всех чисел в диапозоне между num1 и num2
}
