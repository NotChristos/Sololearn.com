class Button {
    var width: Int = 0
    var height: Int = 0
        set(value) {
            field = if (value < 50) // сеттер для св-ва height, чтобы при < 50 значение устанавливалось = 50
                50
            else {
                value
            }
        }
}

fun main(args: Array<String>) {
    val b1 = Button()
    b1.height = readLine()!!.toInt()
    b1.width = readLine()!!.toInt()

    println(b1.width + b1.height)
}
