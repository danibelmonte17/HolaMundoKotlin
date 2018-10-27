fun main(args:Array<String>){

    //varags equivale en java a String...palabras
    fun ejemplo(vararg palabras:String){
        for(palabra in palabras){
            println(palabra)
        }
    }

    ejemplo("Hola","Adios","Que tal?","Estoy bien")

}