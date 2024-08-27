package com.gabrielluciano.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private final List<Item> itens;
    private String status;
    private Double valorTotal;

    public CarrinhoCompra() {
        itens = new ArrayList<>();
        status = "aberto";
        valorTotal = 0.0;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(String item, double valor) {
        itens.add(new Item(item, valor));
        valorTotal += valor;
    }

    public Double exibirValorTotal() {
        return valorTotal;
    }

    public String exibirStatus() {
        return status;
    }

    public boolean confirmarPedido() {
        if (validarCarrinho()) {
            status = "confirmado";
            enviarEmailConfirmacao();
            return true;
        }
        return false;
    }

    public void enviarEmailConfirmacao() {
        System.out.println("Envia e-mail de confirmação...");
    }

    public boolean validarCarrinho() {
        return !itens.isEmpty();
    }
}
