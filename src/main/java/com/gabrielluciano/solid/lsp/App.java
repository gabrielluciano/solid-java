package com.gabrielluciano.solid.lsp;

public class App {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5.0);
        retangulo.setLargura(10.0);

        System.out.println("Área do retângulo: " + retangulo.getArea());

        Quadrado quadrado = new Quadrado();
        quadrado.setAltura(5.0);
        System.out.println("Área do quadrado: " + quadrado.getArea());

        quadrado.setLargura(10.0);
        System.out.println("Área do quadrado: " + quadrado.getArea());
    }
}
