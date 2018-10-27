fun main(args:Array<String>){

    //y tiene un valor por defecto
    fun sumar(x:Int, y:Int=10):Int{
        return x+y
    }

    println(sumar(1,1))
    println(sumar(1))

}