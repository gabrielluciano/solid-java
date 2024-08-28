package com.gabrielluciano.solid.dip.refactor;

public class Sms implements IMensagemToken {

    @Override
    public void enviar(String token) {
        System.out.println("Sms: Seu token é " + token);
    }
}
