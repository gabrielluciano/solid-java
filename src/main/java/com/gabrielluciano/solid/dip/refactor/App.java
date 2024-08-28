package com.gabrielluciano.solid.dip.refactor;

public class App {

    public static void main(String[] args) {
        System.out.println("-------- Canal E-mail");
        Mensageiro mensageiro = new Mensageiro(new Email());
        mensageiro.enviarToken("123-456");

        System.out.println("\n------- Canal Sms");
        Mensageiro mensageiro2 = new Mensageiro(new Sms());
        mensageiro2.enviarToken("789-000");

        System.out.println("\n------- Canal WhatsApp");
        Mensageiro mensageiro3 = new Mensageiro(new WhatsApp());
        mensageiro3.enviarToken("111-222");
    }
}
