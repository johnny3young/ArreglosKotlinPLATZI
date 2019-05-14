object Validaciones{
    fun passwordValidate (psw:String) = psw.isNotEmpty() && psw.length > 10

    fun esNumber (dato: Any) = dato is Int
}

class ClaseUniversal{
    companion object {
        fun create (): ClaseUniversal = ClaseUniversal()
    }
}


fun main() {
    println("Ingresa tu contraseña: ")
    val passw: String = readLine()!!
    println(Validaciones.passwordValidate(passw))

    println("Ingresa algún dato")
    val numero:Any = readLine() ?: 0
    println(Validaciones.esNumber(numero))


    val claseUniversal = ClaseUniversal.create()

}