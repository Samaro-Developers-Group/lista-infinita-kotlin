// para buscar o penultimo item da lista eu busco lista.size - 2 porque o index da lista no kotlin
// vai de 0 até N, se eu fizer size - 1, o retorno será o último elemento da lista.

fun penultimate(lista : List<Int>) : Int {
    val penultimo = lista.get(lista.size - 2 )
    
    return penultimo
}