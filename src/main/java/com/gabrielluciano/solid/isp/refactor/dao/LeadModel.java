package com.gabrielluciano.solid.isp.refactor.dao;

import com.gabrielluciano.solid.isp.refactor.BD;
import com.gabrielluciano.solid.isp.refactor.componentes.Notificacao;
import com.gabrielluciano.solid.isp.refactor.interfaces.Cadastro;
import com.gabrielluciano.solid.isp.refactor.interfaces.INotificacao;

public class LeadModel extends BD implements Cadastro, INotificacao {

    @Override
    public void salvar() {
        System.out.println("Salvando lead!");
    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {
        System.out.println("Enviando notificação a partir de Lead");
    }
}
