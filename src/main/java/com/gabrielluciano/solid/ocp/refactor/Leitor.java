package com.gabrielluciano.solid.ocp.refactor;

import com.gabrielluciano.solid.ocp.refactor.extrator.Arquivo;

import java.util.List;
import java.util.Map;

public class Leitor {
    private final Arquivo arquivo;
    private String diretorio;
    private String nomeArquivo;

    public Leitor(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<Map<String, String>> lerArquivo() {
        String caminho = diretorio + "\\" + nomeArquivo;
        arquivo.lerArquivo(caminho);
        return arquivo.getDados();
    }
}
