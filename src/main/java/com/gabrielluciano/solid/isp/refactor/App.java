package com.gabrielluciano.solid.isp.refactor;

import com.gabrielluciano.solid.isp.refactor.componentes.Log;
import com.gabrielluciano.solid.isp.refactor.componentes.Notificacao;
import com.gabrielluciano.solid.isp.refactor.dao.ContratoModel;
import com.gabrielluciano.solid.isp.refactor.dao.LeadModel;
import com.gabrielluciano.solid.isp.refactor.dao.UsuarioModel;

public class App {

    public static void main(String[] args) {
        ContratoModel contratoModel = new ContratoModel();
        contratoModel.salvar();

        System.out.println();

        LeadModel leadModel = new LeadModel();
        leadModel.salvar();
        leadModel.enviarNotificacao(new Notificacao());

        System.out.println();

        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.salvar();
        usuarioModel.enviarNotificacao(new Notificacao());
        usuarioModel.registrarLog(new Log());
    }
}
