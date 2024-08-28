package com.gabrielluciano.solid.dip.refactor;

public class WhatsApp implements IMensagemToken {

    @Override
    public void enviar(String token) {
        System.out.println("WhatsApp: Seu token é " + token);
    }
}
