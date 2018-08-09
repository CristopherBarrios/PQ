package main
fun main(args: Array<String>){
    val pregunta = readLine()!!.toInt()
    println("""Menu:
        1. Administrador
        2. Conductor
        3. Salir
    """.trimMargin())
    val menu = """Menu:
        |1.Crear nivel
        |2.Eliminar nivel
        |3.Ver todos los niveles
        |4.Salir""".trimMargin()
    if (pregunta == 1){
        println("Bienvenido administrador")
        println(menu)
    }
    else if (pregunta == 2){
        println("Bienvenido Conductor")
        println(menu)
    }
    else
        println("Salir")
}
