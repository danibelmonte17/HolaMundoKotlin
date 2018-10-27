fun main(args:Array<String>){

    var frase:String = "Esto    es una cadena    con espacios"

    fun String.quitarEspacios():String{
        var regex = Regex("\\s+")
        return regex.replace(this, " ")
    }

    println(frase.quitarEspacios())

}