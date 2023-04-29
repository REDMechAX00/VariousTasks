package patterns.simpleFactory

class Rational private constructor(a: Int, b: Int) {

    val valueA = a
    val valueB = b

    companion object {
        fun makeFromTwoInts(a: Int, b: Int): Rational {
            return Rational(a, b)
        }

        fun makeFromTwoFloats(a: Float, b: Float): Rational {
            return Rational(a.toInt(), b.toInt())
        }
    }
}