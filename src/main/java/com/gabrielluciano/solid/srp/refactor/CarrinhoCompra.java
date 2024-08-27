package com.gabrielluciano.solid.srp.refactor;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private final List<Item> itens;

    public CarrinhoCompra() {
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public boolean addItem(Item item) {
        itens.add(item);
        return true;
    }

    public boolean isVazio() {
        return itens.isEmpty();
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "itens=" + itens +
                '}';
    }

    public Double calcularTotal() {
        return itens.stream()
                .map(Item::getValor)
                .reduce(0.0, Double::sum);
    }
}
