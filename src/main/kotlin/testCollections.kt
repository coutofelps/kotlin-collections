class namesDatabase {
    val names: Collection<String> get() = data

    fun add(name: String) {
        data.add(name)
    }

    companion object {
        private val data = mutableListOf<String>()
    }
}

fun testCopy() {
    val db = namesDatabase()
    db.add("Marcos Felipe")
    println(db.names)
}

fun testCollections() {
    val names: MutableCollection<String> = mutableListOf("Fernanda", "Laura", "Mari", "Valentina")

    // Iterable
    for(name in names.iterator()) {
        println(name)
    }

    // Adicionando um nome na lista
    names.add("Paulo")

    // Removendo um nome da lista
    names.remove("Mari")

    println(names.toString())
    println("Tem o nome da Fernanda? ${names.contains("Fernanda")}")
    println("Tamanho da coleção: ${names.size}")
}