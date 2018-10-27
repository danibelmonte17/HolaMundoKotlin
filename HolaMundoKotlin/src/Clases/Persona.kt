package Clases

class Persona constructor(nombre: String, edad: Int) {

    var nombre: String
        get(){
            return this.nombre
        }
        set(nombre) {
            this.nombre = nombre
        }

    var edad: Int = 0

    //solo es necesario cuando tenemos que meter mas lineas de codigo a parte de las de asignar los valores a las variables
    init {
        this.nombre = nombre
        this.edad = edad
    }

    constructor(nombre: String) : this(nombre, edad = 0)

    fun saluda() {
        println("Hola " + this.nombre + " tengo " + this.edad)
    }


}