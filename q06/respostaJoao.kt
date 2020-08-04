fun  isPalindrome(lista : List<Int>) : Boolean {
    val palindrono = lista.reversed()
    
    return palindrono.equals(lista)
}