package com.gabrielluciano.solid.isp.refactor.dao;

import com.gabrielluciano.solid.isp.refactor.BD;
import com.gabrielluciano.solid.isp.refactor.componentes.Log;
import com.gabrielluciano.solid.isp.refactor.componentes.Notificacao;
import com.gabrielluciano.solid.isp.refactor.interfaces.Cadastro;
import com.gabrielluciano.solid.isp.refactor.interfaces.ILog;
import com.gabrielluciano.solid.isp.refactor.interfaces.INotificacao;

public class UsuarioModel extends BD implements Cadastro, INotificacao, ILog {

    public void salvar() {
        System.out.println("Salvando usuario!");
    }

    @Override
    public void registrarLog(Log log) {
        System.out.println("Registrando log a partir de Usuario");
    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {
        System.out.println("Enviando notificação a partir de Usuario");
    }
}
