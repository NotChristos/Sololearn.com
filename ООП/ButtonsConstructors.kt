class Button(val width: Int, val height: Int)

fun main(args: Array<String>) {
    val b1 = Button(readLine()!!.toInt(), readLine()!!.toInt())

    println(b1.width * b1.height)
}
