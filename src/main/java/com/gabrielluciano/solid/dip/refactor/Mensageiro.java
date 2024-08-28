package com.gabrielluciano.solid.dip.refactor;

public class Mensageiro {

    private final IMensagemToken canal;

    public Mensageiro(IMensagemToken canal) {
        this.canal = canal;
    }

    public void enviarToken(String token) {
        System.out.println("Mensageiro enviando mensagem a partir de " +
                canal.getClass().getName());
        canal.enviar(token);
    }
}
