package com.gabrielluciano.solid.ocp;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arquivo {

    private static final String CSV_SEPARADOR = ";";
    private List<Map<String, String>> dados = new ArrayList<>();

    public void lerArquivoCSV(String caminho) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(caminho), StandardCharsets.UTF_8)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] colunas = linha.split(CSV_SEPARADOR);
                setDados(colunas[0], colunas[1], colunas[2]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lerArquivoTXT(String caminho) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(caminho), StandardCharsets.UTF_8)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                setDados(
                        linha.substring(11, 41).trim(),
                        linha.substring(0, 11),
                        linha.substring(41)
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setDados(String nome, String cpf, String email) {
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
