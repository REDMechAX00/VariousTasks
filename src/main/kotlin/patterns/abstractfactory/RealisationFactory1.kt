package patterns.abstractfactory

class RealisationFactory1: AbstractFactory {

    override fun createCat(): Cat {
        return AnimalCat1()
    }

    override fun createDog(): Dog {
        return AnimalDog1()
    }
}