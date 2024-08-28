package com.gabrielluciano.solid.lsp.refactor.poligonos;

public class Quadrado implements Poligono {

    protected Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
