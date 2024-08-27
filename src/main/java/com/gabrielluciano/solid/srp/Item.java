package com.gabrielluciano.solid.srp;

import java.util.Objects;

public class Item {
    private final String nome;
    private final Double valor;

    public Item(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(nome, item.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
