fun main(args:Array<String>){

    var x:Int = 20
    var y:Int = 1
    val dato = if(x>y) x else y
    println(dato)

    var entero:Int = 2
    if(entero is Int) println("Es entero") else println("No es entero")

    var numero:Int = 1
    when(numero){
        1 ->{
            println("1")
        }
        is Int->{
            println("Es entero")
        }
        7,8,9->{
            println("valores 3")
        }
        else->{
            println("No se encontro el valor")
        }
    }

}