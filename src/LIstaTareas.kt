class ListaTareas (){
    val tareas : MutableList<Tarea> = mutableListOf()
    fun agregarTarea(tarea: Tarea){
        tareas.add(tarea)
    }
    fun eliminarTarea(id: Int){
        tareas.removeAt(id - 1)
    }
    fun mostratTareas(){
        for (tarea : Tarea in tareas){
            tarea.mostrarInfo()
        }
    }
    fun buscarTareas(id: Int) : Tarea{
        for (x : Tarea in tareas){
            if (x.id == id){
                 return x
            }
        }
        println("No hay ninguna tarea con ese id")
        val tarea = Tarea(0,"","")
        return tarea
    }
    fun tareasCompletadas(){
        for(tarea : Tarea in tareas){
            if (tarea.completada){
                println(tarea.mostrarInfo())
            }
        }
    }
}