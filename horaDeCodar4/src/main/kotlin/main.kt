fun main() {
    println("Qual lição quer realizar\n1-lição 1\n2-lição 2\n3-lição 3\n4-sair")
    var licao = readln()!!.toInt()

    when(licao){
        1 -> licao1()
        2 -> licao2()
        3 -> licao3()
        4 -> sair()
    }
}

fun licao1(){
    val estudantes = mutableListOf<String>()

    while (true) {
        println("Digite o nome do estudante ou 'PARE' para encerrar:")
        val entrada = readLine()

        if (entrada.isNullOrBlank()) {
            println("Digite um nome válido ou 'PARE' para encerrar.")
            continue
        }

        if (entrada.equals("PARE", ignoreCase = true)) {
            break
        }

        estudantes.add(entrada)
    }

    println("Quantidade de estudantes cadastrados: ${estudantes.size}")
    println("Lista de estudantes:")
    for (estudante in estudantes) {
        println(estudante)
    }
}

fun licao2(){

    val planetas = listOf("Terra, Marte, Plutão, Vênus, Júpiter, Saturno")

    println("Digite o nome de um planeta: ")
    var planeta = readln()!!.uppercase()

    if (planeta.isNullOrBlank()) {
        println("Digite um nome de planeta válido.")
        return
    }

    if(planetas.contains(planeta)){
        println("O planeta $planeta está na lista!")
    }else{
        println("O planeta $planeta não está na lista!")
    }
}

fun licao3(){
    val frutas = mutableListOf("banana", "maçã", "pera", "uva", "melancia", "maracujá", "goiaba")

    println("Frutas diposníveis: $frutas")

   while (frutas.isNotEmpty()){
       print("Qual fruta gostaria de remover do carrinho? ")
       val frutaParaRemover = readLine()?.trim()?.lowercase()

       if(frutaParaRemover in frutas){
           frutas.remove(frutaParaRemover)
           println("Fruta retirada da lista")
       }else{
           println("Fruta não está na lista")
       }

       if(frutas.isNotEmpty()){
           println("Lista de frutas atualizada: $frutas")
       }
   }

    println("Lista de compras finalizada!")
}

fun sair(){
    print("Obrigado por acessar minha lição")
}