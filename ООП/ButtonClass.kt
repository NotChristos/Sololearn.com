class Button {
    var width = 0
    var height = 0
}

fun main(args: Array<String>) {
    var b1 = Button()
    b1.width = readLine()!!.toInt()
    b1.height = readLine()!!.toInt()

    println(b1.width + b1.height)
}
