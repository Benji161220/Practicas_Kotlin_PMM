class Tarea (var id: Int,var titulo: String, var descripcion: String){
    var completada = false
    fun marcarComoCompletada(){
        completada = true
    }
    fun Tarea(){}
    fun mostrarInfo(){
        if (completada){
            println("[V] "+id+" - "+titulo+"("+descripcion+")")
        } else{
            println("[ ] "+id+" - "+titulo+"("+descripcion+")")
        }
    }
}