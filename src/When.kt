fun type (dato: Any){
    when (dato){
        is String -> println(dato.length)

        is Int -> println(dato.times(2))

        is Boolean -> println("El $dato es Booleano")

        else -> println("No se que objeto es")
    }

}

fun whoIs(){

}


fun main() {
    type("Johnny")
}