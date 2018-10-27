package Clases

data class EjemploDataClass(var nombre:String, var edad:Int) {

    fun mostrarInfo(): String{
        return this.nombre + " : "+ this.edad;
    }

}