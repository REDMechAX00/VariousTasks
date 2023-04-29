package patterns.abstractfactory

interface AbstractFactory {

    fun createCat(): Cat

    fun createDog(): Dog
}