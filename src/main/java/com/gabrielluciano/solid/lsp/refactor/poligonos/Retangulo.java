package com.gabrielluciano.solid.lsp.refactor.poligonos;

public class Retangulo implements Poligono {
    private Double largura;
    private Double altura;

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

    @Override
    public double getArea() {
        return largura * altura;
    }
}
