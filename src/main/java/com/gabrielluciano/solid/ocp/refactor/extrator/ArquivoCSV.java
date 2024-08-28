package com.gabrielluciano.solid.ocp.refactor.extrator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArquivoCSV extends Arquivo {

    private static final String CSV_SEPARADOR = ";";

    @Override
    public void lerArquivo(String caminho) {
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
}
