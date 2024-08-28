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

        System.out.println("---- Violação do Liskov Substitution Principle ----");

        Retangulo retangulo2 = new Quadrado();
        retangulo2.setAltura(5.0);
        retangulo2.setLargura(10.0);

        System.out.println("Área do retângulo 2: " + retangulo2.getArea()); // Incorreta!
    }
}
