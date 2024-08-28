package com.gabrielluciano.solid.dip;

public class Mensageiro {

    private String canal;

    public void enviarToken(String token) {
        if ("email".equals(canal)) {
            Email email = new Email();
            email.enviar(token);
        } else if ("sms".equals(canal)) {
            Sms sms = new Sms();
            sms.enviar(token);
        }
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
}
