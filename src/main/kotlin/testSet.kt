fun testSet() {
    val androidStudents: MutableSet<String> = mutableSetOf("Fernanda", "Laura", "Mari", "Valentina")
    val kotlinStudents: MutableSet<String> = mutableSetOf("Laura", "Luana", "Mari")
    val bothStudents = mutableSetOf<String>()

    // val bothStudents: Set<String> = androidStudents + kotlinStudents

    // bothStudents.addAll(androidStudents)
    // bothStudents.addAll(kotlinStudents)

    // Todas as pessoas que estão presentes nas duas listas, sem as repetir
    println(androidStudents union kotlinStudents)

    // Pessoas que estão estão na primeira lista serão retiradas da segunda lista
    println(androidStudents subtract kotlinStudents)

    // Pessoas que estão nas duas listas
    println(androidStudents intersect kotlinStudents)

    val viewersList = bothStudents.toMutableList()
    viewersList.add("Marcos Felipe")
    println(viewersList)
    println(viewersList.toSet())
}