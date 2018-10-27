
fun main(args:Array<String>){

    //la iniciacion perezosa solo se puede usar para los valores inmutables estas se inicializan cuando se van a usar

    val edad:Int by lazy { 10 }

    println(edad)

}

