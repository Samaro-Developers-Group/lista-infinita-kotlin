fun flatt(lista : List<Int>) : List<Int>{
    val listaQueSeraRetornada = mutableListOf<Any?>()
 
 	val listaEspalhada = flattenList(deepList, thisList)
    
    return listaEspalhada
}

// Uso de recursividade para resolver alguns problemas da lista.
// Em resumo, a função verifica se o valor é uma lista ou não, se não for uma lista ele adiciona
// na lista que vai ser retornada, se for, a posição vai ser repetida na recursão até espalhar 
// todos os valores do array interno.

fun flattenList(nestedList: List<Any?>, flatList: MutableList<Any?>) : List<Any?>{
  nestedList.forEach{
    e -> when(e){
      !is List<Any?> -> flatList.add(e)
      else -> flattenList(e, flatList)
    }
  }
  
  return flatList
}


