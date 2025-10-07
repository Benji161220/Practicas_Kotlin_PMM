class Usuario(var nombre: String, var lista: ListaTareas) {
    fun saludar(){
        println("Hola, soy "+nombre+". Estas son mis tareas pendientes "+lista)
    }
}