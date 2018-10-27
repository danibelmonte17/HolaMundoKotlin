fun main(args:Array<String>){

    var nombres = listOf("Carlos","Lucas","Maria","Isabel")

    for(nombre in nombres){
        print(nombre+" ")
    }

    println()

    for(x in 1..10){
        print(x)
    }

    println()

    for(x in 1..10 step 2){
        print(x)
    }

    println()

    for(x in 20 downTo 1){
        print(x)
    }

    println()

    for(x in 20 downTo 1 step 2){
        print(x)
    }

}