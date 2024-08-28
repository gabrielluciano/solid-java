package com.gabrielluciano.solid.dip;

public class App {

    public static void main(String[] args) {
        System.out.println("-------- Canal E-mail");
        Mensageiro mensageiro = new Mensageiro();
        mensageiro.setCanal("email");
        mensageiro.enviarToken("123-456");

        System.out.println("\n------- Canal Sms");
        Mensageiro mensageiro2 = new Mensageiro();
        mensageiro2.setCanal("sms");
        mensageiro2.enviarToken("789-000");
    }
}
