/*
Bruno Wilson Moura Do Nascimento
*/
abstract class Animal(val name:String){
    abstract fun makeSound()
}
class Dog(name:String) : Animal(name){
    override fun makeSound(){
        println("Animal $name faz \nWoof!  ")
    }
}

class Cat(name:String) : Animal(name){
    override fun makeSound(){
        println("Animal $name faz \nMeow!  ")
    }
}
fun animalSounds(animais: List<Animal>) {
    for (animal in animais) {
        animal.makeSound()
    }
}
fun main() {
    val animais = listOf(Dog("Hector"),Cat("Frajola"))
    animalSounds(animais)
}