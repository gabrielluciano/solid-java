package com.gabrielluciano.solid.isp;

import com.gabrielluciano.solid.isp.componentes.Log;
import com.gabrielluciano.solid.isp.componentes.Notificacao;
import com.gabrielluciano.solid.isp.dao.ContratoModel;
import com.gabrielluciano.solid.isp.dao.LeadModel;
import com.gabrielluciano.solid.isp.dao.UsuarioModel;

public class App {

    public static void main(String[] args) {
        ContratoModel contratoModel = new ContratoModel();
        contratoModel.salvar();
//        contratoModel.enviarNotificacao(new Notificacao()); // Unsupported
//        contratoModel.registrarLog(new Log()); // Unsupported

        System.out.println();

        LeadModel leadModel = new LeadModel();
        leadModel.salvar();
        leadModel.enviarNotificacao(new Notificacao());
//        leadModel.registrarLog(new Log()); // Unsupported

        System.out.println();

        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.salvar();
        usuarioModel.enviarNotificacao(new Notificacao());
        usuarioModel.registrarLog(new Log());
    }
}
