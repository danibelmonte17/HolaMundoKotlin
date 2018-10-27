fun main(args:Array<String>){

    var num:Int = 20

    when(num){
        in 1..10->{
            println("Rango 1")
        }
        in 11..20->{
            println("Rango 2")
        }
        else->{
            println("No se encuentra en los rangos")
        }
    }

}