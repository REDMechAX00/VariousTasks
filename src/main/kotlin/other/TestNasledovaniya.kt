package other

class FilledRectangle : Rectangle() {
    override fun draw() {
        //super.draw()
        println("Заполнение прямоугольника")
    }

    val fillColor: String get() = super.borderColor
}

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // члены интерфейса открыты ('open') по умолчанию
}

class Square() : Rectangle(), Polygon {
    // Компилятор требует, чтобы функция draw() была переопределена:
    override fun draw() {
        super<Rectangle>.draw() // вызов other.Rectangle.draw()
        super<Polygon>.draw() // вызов other.Polygon.draw()
    }
}

fun main(){
    val filledRectangle = FilledRectangle()
    filledRectangle.draw()

    Square().draw()

    fun printHello(name: String?): Unit {
        if (name != null)
            println("Hello $name")
        else
            println("Hi there!")
        // `return Unit` или `return` необязательны
    }
}