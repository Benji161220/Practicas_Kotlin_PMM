import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val sc = Scanner(System.`in`)
    println("Introduce tu nombre de usuario")
    val nombre = sc.nextLine()
    val lista = ListaTareas()
    val usuario = Usuario(nombre, lista)
    do {
        println("Elige una de las opciones usando el numero de la opcion \n" +
                "1. Agregar tarea \n" +
                "2. Mostrar tareas \n" +
                "3. Marcar tarea como completada \n" +
                "4. Eliminar tarea \n" +
                "5. Ver solo tareas completadas \n" +
                "6. Salir del menu")
        val opcion = sc.nextInt()
        when(opcion){
            1 -> {
                println(
                    "Introduce en este orden la tarea y sin usar espacios \n" +
                            "1. id, 2. titulo 3. descripcion"
                )
                val tarea = Tarea(sc.nextInt(),sc.next(),sc.next())
                usuario.lista.agregarTarea(tarea)
            }
            2 -> {
                usuario.lista.mostratTareas()
            }
            3 -> {
                println("Introduce el id de la tarea")
                usuario.lista.buscarTareas(sc.nextInt()).marcarComoCompletada()
            }
            4 -> {
                println("Introduce el id de la tarea")
                usuario.lista.eliminarTarea(sc.nextInt())
            }
            5 -> {
                usuario.lista.tareasCompletadas()
            }

        }
    } while (opcion != 6)

}
