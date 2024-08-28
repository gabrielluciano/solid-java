package com.gabrielluciano.solid.isp.dao;

import com.gabrielluciano.solid.isp.BD;
import com.gabrielluciano.solid.isp.componentes.Log;
import com.gabrielluciano.solid.isp.componentes.Notificacao;
import com.gabrielluciano.solid.isp.interfaces.Cadastro;

public class LeadModel extends BD implements Cadastro {

    @Override
    public void salvar() {
        System.out.println("Salvando lead!");
    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {
        System.out.println("Enviando notificação a partir de Lead");
    }

    @Override
    public void registrarLog(Log log) {
        throw new UnsupportedOperationException("Esta classe não registra logs!");
    }
}
