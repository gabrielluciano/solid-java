package com.gabrielluciano.solid.isp.dao;

import com.gabrielluciano.solid.isp.BD;
import com.gabrielluciano.solid.isp.componentes.Log;
import com.gabrielluciano.solid.isp.componentes.Notificacao;
import com.gabrielluciano.solid.isp.interfaces.Cadastro;

public class ContratoModel extends BD implements Cadastro {

    @Override
    public void salvar() {
        System.out.println("Salvando contrato!");
    }

    @Override
    public void registrarLog(Log log) {
        throw new UnsupportedOperationException("Esta classe não registra logs!");
    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {
        throw new UnsupportedOperationException("Esta classe não envia notificações!");
    }
}
