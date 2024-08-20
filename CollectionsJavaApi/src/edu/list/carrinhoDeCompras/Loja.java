package edu.list.carrinhoDeCompras;

public class Loja {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Tenis Nike", 250.30, 1);
        carrinhoDeCompras.adicionarItem("Calca jeans", 100.33, 2);
        carrinhoDeCompras.adicionarItem("Camiseta Preta", 40.90, 2);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("Tenis Nike");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
