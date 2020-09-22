package br.com.digital

class Combo (val listaItens: MutableList<Item>, val desconto: Float, nome: String) : Item(nome){
    override var preco: Float = 0.0f

    init {
        listaItens.forEach {
            preco += it.preco * (1 - desconto)
        }

        println("O valor total do combo é R$: $preco")
    }
}