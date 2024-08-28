package com.gabrielluciano.solid.lsp;

public class Retangulo {
    protected Double largura;
    protected Double altura;

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return largura * altura;
    }
}
