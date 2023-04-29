package other

open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }

    open val vertexCount: Int = 0
    open var vertexCountVar: Int = 0
}