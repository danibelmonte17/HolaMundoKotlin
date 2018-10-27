class ModificadoresAcceso {

    //es como si fuera publica, se puede acceder desde donde sea
    var x:Int = 1
    //solo se puede acceder al elemento desde el modulo de kotlin
    internal var y:Int = 2
    //solo se puede acceder a el desde la clase que lo define y las derivadas
    protected var z:Int = 3
    //solo se puede acceder desde la clase que esta definido
    private var m:Int = 4

}