package br.com.digital

fun main() {
    val batata = Produto("batata", 10.0f)
    val hamburger = Produto("hamburger", 20.0f)
    val refrigerante = Produto("refrigerante", 5.0f)

    val batataGrande = Produto("batata grande", 20.0f)
    val hamburgerGrande = Produto("hamburger grande", 30.0f)
    val refrigeranteGrande = Produto("refrigerante grande", 7.0f)

    val comboMedio = Combo(mutableListOf(batata, hamburger, refrigerante), 0.1f, "combo medio")
    val comboGrande = Combo(mutableListOf(batataGrande, hamburgerGrande, refrigeranteGrande), 0.15f, "combo grande")

    val comboFamilia = Combo(mutableListOf(comboMedio, comboGrande), 0.2f, "combo familia")

    val carrinho = Carrinho()
    carrinho.adicionarItem(comboFamilia)
    carrinho.adicionarItem(refrigeranteGrande)

    carrinho.removerItem(comboFamilia)
}