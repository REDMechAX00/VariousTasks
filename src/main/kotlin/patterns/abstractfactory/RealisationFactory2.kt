package patterns.abstractfactory

class RealisationFactory2: AbstractFactory {

    override fun createCat(): Cat {
        return AnimalCat2()
    }

    override fun createDog(): Dog {
        return AnimalDog2()
    }
}