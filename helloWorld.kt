enum class Sexo {
    HOMBRE, MUJER
}

fun saludar(saludo: String, nombre: String){
    println("$saludo $nombre")
}

fun mostrarGenero(sexo: Sexo){
    println("Mi genero es: $sexo")
}

fun main() {
	val nombre: String = "Jean Paul Cabrera Flores"
	val nombreMateria: String = "Aplicaciones Móviles"
	val peso: Int = 70
	val altura: Int = 171
	val edad: Int = 22
	val sexo = Sexo.HOMBRE
	val esPar: Boolean = if (edad % 2 == 0) true else false

    println("$nombre $nombreMateria")
    println("Peso: $peso kg")
    println("Altura: $altura cm")
    println("Edad: $edad")
    println("Sexo: $sexo")
    println("Edad par: ${if (esPar) "Sí" else "No"}")
    val saludo: String = "Hola"
    println()
    saludar(saludo, nombre)
    mostrarGenero(sexo)
}
