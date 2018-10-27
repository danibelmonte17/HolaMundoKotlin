package Clases

abstract class Ejemplo{
    abstract fun sumar(x:Int, y:Int):Int
}

//los parentesis son el constructor
class EjemploImpl: Ejemplo (){

    override fun sumar(x: Int, y: Int): Int {
        return x+y
    }

}