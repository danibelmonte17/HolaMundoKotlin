fun main(args:Array<String>){

    fun imprimir(){
        println("HOLA MUNDO!")
    }

    fun devolverSaludo():String{
        return "Hola Mundo!"
    }

    fun imprimir(frase:String){
        println(frase)
    }

    fun imprimir(frase:String, x:Int){
        for(x in 1..x){
            println(frase+" "+x)
        }
    }

    //funcion con void en kotlin (no regresa nada) Unit no es necesario
    fun imprimirNada():Unit{
        println("Nada")
    }

    imprimir()

    println(devolverSaludo())

    imprimir("Imprimimos la frase")

    imprimir("Frase", 3)

    fun imprimir(dia:Int, mes:Int, año:Int){
        println(dia.toString()+"/"+mes.toString()+"/"+año.toString())
    }

    imprimir(dia=10, mes=12, año=2018)


}