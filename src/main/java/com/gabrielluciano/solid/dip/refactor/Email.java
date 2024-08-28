package com.gabrielluciano.solid.dip.refactor;

public class Email implements IMensagemToken {

    @Override
    public void enviar(String token) {
        System.out.println("E-mail: Seu token é " + token);
    }
}
