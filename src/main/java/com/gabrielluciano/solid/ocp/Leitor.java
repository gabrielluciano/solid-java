package com.gabrielluciano.solid.ocp;

import java.util.List;
import java.util.Map;

public class Leitor {
    private String diretorio;
    private String nomeArquivo;

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
        Arquivo arquivo = new Arquivo();

        String extensao = caminho.split("\\.")[1];

        if ("csv".equals(extensao)) {
            arquivo.lerArquivoCSV(caminho);
        } else if ("txt".equals(extensao)) {
            arquivo.lerArquivoTXT(caminho);
        }

        return arquivo.getDados();
    }
}
