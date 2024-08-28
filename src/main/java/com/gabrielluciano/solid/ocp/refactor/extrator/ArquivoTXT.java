package com.gabrielluciano.solid.ocp.refactor.extrator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArquivoTXT extends Arquivo {

    @Override
    public void lerArquivo(String caminho) {
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
}
