package br.com.digital

class ComboSimples(val listaProdutos: MutableList<Produto>, val desconto: Float, val nome: String) {
    var preco: Float = 0.0f

    init {
        listaProdutos.forEach {
            preco += it.preco * (1 - desconto)
        }

        println("O valor total do combo é R$: $preco")
    }
}