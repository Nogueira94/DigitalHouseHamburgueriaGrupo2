package br.com.digital

class Carrinho() {

    val itens = mutableListOf<Item>()
    var valorTotal = 0.0f

    fun calcularValorTotal() {
        itens.forEach {
            valorTotal += it.preco
        }

        println("O valor total do carrinho é R$: $valorTotal")
    }

    fun adicionarItem(vararg item: Item) {
        try {
            itens.addAll(item)
            calcularValorTotal()
        } catch (ex: Exception) {
            println("Erro ao adicionar um item")
            ex.stackTrace
        }
    }

    fun removerItem(item: Item) {
        try {
            itens.remove(item)
            calcularValorTotal()
        } catch (ex: Exception) {
            println("Erro ao remover o produto")
            ex.stackTrace
        }
    }


}