package com.gabrielluciano.solid.isp.dao;

import com.gabrielluciano.solid.isp.BD;
import com.gabrielluciano.solid.isp.componentes.Log;
import com.gabrielluciano.solid.isp.componentes.Notificacao;
import com.gabrielluciano.solid.isp.interfaces.Cadastro;

public class UsuarioModel extends BD implements Cadastro {

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
