package Clases

class AnimalHerencia: Animal {

    override val edad:Int = 10

    constructor(nombre:String, edad:Int):super(nombre,edad)

    override fun saludar(){
        println("Hola "+this.nombre)
    }

}