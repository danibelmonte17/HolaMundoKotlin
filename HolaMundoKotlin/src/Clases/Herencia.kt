package Clases

open class Animal(nombre:String){

    var nombre:String = ""
    open val edad:Int = 0

    init {
        this.nombre = nombre
    }

    constructor(nombre: String, edad: Int):this(nombre){
        print("Contructor 2")
    }

    open fun saludar(){
        println("Hola!")
    }
}