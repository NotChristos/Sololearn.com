open class Component(width: Int, height: Int) {
    // ограничение на публичный доступ к св-вам width и height
    protected var width = width
    protected var height = height
}

class Button(width: Int, height: Int) : Component(width, height) {
    private var name: String = "Button"
    fun tap() {
        println("$name was tapped")
    }
}

class Image(width: Int, height: Int) : Component(width, height) {
    fun draw() {
        println(width.toString() + "x" + height.toString())
    }
}

fun main(args: Array<String>) {
    val b1 = Button(200, 50)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}
