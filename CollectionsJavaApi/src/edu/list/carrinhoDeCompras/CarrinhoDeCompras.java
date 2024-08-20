package edu.list.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item produto = new Item(nome, preco, quantidade);
        carrinho.add(produto);
        if (carrinho.size() > 0) {
            System.out.println("Produto adicionado com sucesso!");
        }
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();

        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensRemover.add(item);
            }

        }
        carrinho.removeAll(itensRemover);

    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item item : carrinho) {
            total += item.getQuantidade() * item.getPreco();
        }

        System.out.println("Total R$" + String.format("%.2f", total));
    }

    public void exibirItens() {
        System.err.println(carrinho);
    }
}
