package com.gabrielluciano.solid.lsp.refactor;

import com.gabrielluciano.solid.lsp.refactor.poligonos.Poligono;
import com.gabrielluciano.solid.lsp.refactor.poligonos.Quadrado;
import com.gabrielluciano.solid.lsp.refactor.poligonos.Retangulo;

public class App {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5.0);
        retangulo.setLargura(10.0);

        System.out.print("Área do retângulo: ");
        printArea(retangulo);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5.0);
        System.out.print("Área do quadrado: ");
        printArea(quadrado);
    }

    public static void printArea(Poligono poligono) {
        System.out.println(poligono.getArea());
    }
}
