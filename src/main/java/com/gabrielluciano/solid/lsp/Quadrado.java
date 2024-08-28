package com.gabrielluciano.solid.lsp;

public class Quadrado extends Retangulo {

    @Override
    public void setLargura(Double largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    @Override
    public void setAltura(Double altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }
}
