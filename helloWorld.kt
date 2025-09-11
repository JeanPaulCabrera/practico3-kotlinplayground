enum class Sexo {
    HOMBRE, MUJER
}

class Persona(
    val nombre: String,
    val nombreMateria: String,
    val peso: Int,
    val altura: Int,
    val edad: Int,
    val sexo: Sexo
) {
    private val esPar: Boolean = edad % 2 == 0

    fun mostrarDatos() {
        println("$nombre $nombreMateria")
        println("Peso: $peso kg")
        println("Altura: $altura cm")
        println("Edad: $edad")
        println("Sexo: $sexo")
        println("Edad par: ${if (esPar) "Sí" else "No"}")
    }

    fun saludar(saludo: String) {
        println("$saludo $nombre")
    }

    fun mostrarGenero() {
        println("Mi género es: $sexo")
    }

    fun esMayorDeEdad() {
        if (edad >= 18) {
            println("Soy mayor de edad ✔")
        } else {
            println("Soy menor de edad ✘")
        }
    }
}

fun main() {
    val persona = Persona(
        nombre = "Jean Paul Cabrera Flores",
        nombreMateria = "Aplicaciones Móviles",
        peso = 70,
        altura = 171,
        edad = 22,
        sexo = Sexo.HOMBRE
    )

    persona.mostrarDatos()
    println()
    persona.saludar("Hola")
    persona.mostrarGenero()
    persona.esMayorDeEdad()
}
