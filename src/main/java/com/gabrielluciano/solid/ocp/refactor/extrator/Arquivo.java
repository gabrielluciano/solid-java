package com.gabrielluciano.solid.ocp.refactor.extrator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Arquivo {

    private List<Map<String, String>> dados = new ArrayList<>();

    public abstract void lerArquivo(String caminho);

    protected void setDados(String nome, String cpf, String email) {
        Map<String, String> dado = new HashMap<>();
        dado.put("nome", nome);
        dado.put("cpf", cpf);
        dado.put("email", email);
        dados.add(dado);
    }

    public List<Map<String, String>> getDados() {
        return dados;
    }
}
