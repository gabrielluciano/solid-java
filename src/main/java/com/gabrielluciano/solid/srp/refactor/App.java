package com.gabrielluciano.solid.srp.refactor;

public class App {

    public static void main(String[] args) {
        var carrinho = new CarrinhoCompra();

        carrinho.addItem(new Item("Bicicleta", 750.10));
        carrinho.addItem(new Item("Geladeira", 1950.15));
        carrinho.addItem(new Item("Tapete", 350.20));

        var pedido = new Pedido(carrinho);

        println("Pedido");
        println(pedido);
        println();

        println("Valor do pedido");
        println(pedido.getValorPedido());
        println();

        println("Itens do Carrinho");
        println(carrinho.getItens());
        println();

        println("Carrinho vazio");
        println(carrinho.isVazio());
        println();

        println("Status pedido");
        println(pedido.getStatus());
        pedido.confirmar();
        println(pedido.getStatus());
        println();

        System.out.println("E-mail Service");
        System.out.println(EmailService.dispararEmail());
        println();
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }

    private static void println() {
        System.out.println();
    }
}
