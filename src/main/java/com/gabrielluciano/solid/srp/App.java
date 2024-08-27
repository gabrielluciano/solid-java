package com.gabrielluciano.solid.srp;

public class App {

    public static void main(String[] args) {
        var carrinho1 = new CarrinhoCompra();
        System.out.println(carrinho1.getItens());
        System.out.println("Valor total: " + carrinho1.exibirValorTotal());

        if (carrinho1.confirmarPedido()) {
            System.out.println("Pedido confirmado");
        } else {
            System.out.println("Pedido não confirmado");
        }

        carrinho1.adicionarItem("Bicicleta", 750.10);
        carrinho1.adicionarItem("Geladeira", 1950.15);
        carrinho1.adicionarItem("Tapete", 350.20);

        System.out.println(carrinho1.getItens());
        System.out.println("Valor total: " + carrinho1.exibirValorTotal());
        System.out.println("Status: " + carrinho1.exibirStatus());

        if (carrinho1.confirmarPedido()) {
            System.out.println("Pedido confirmado");
        } else {
            System.out.println("Pedido não confirmado");
        }

        System.out.println("Status: " + carrinho1.exibirStatus());
    }
}
