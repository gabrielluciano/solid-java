package com.gabrielluciano.solid.srp.refactor;

import java.util.Objects;

public class Item {
    private final String descricao;
    private final Double valor;

    public Item(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(descricao, item.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
