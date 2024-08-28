package com.gabrielluciano.solid.isp.interfaces;

import com.gabrielluciano.solid.isp.componentes.Log;
import com.gabrielluciano.solid.isp.componentes.Notificacao;

public interface Cadastro {
    void salvar();

    void registrarLog(Log log);

    void enviarNotificacao(Notificacao notificacao);
}
