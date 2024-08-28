package com.gabrielluciano.solid.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        // ---------------------- TXT
        Leitor leitorTXT = new Leitor();
        leitorTXT.setDiretorio("src\\main\\resources");
        leitorTXT.setNomeArquivo("dados.txt");

        var dadosTXT = leitorTXT.lerArquivo();
        System.out.println(dadosTXT);

        // ---------------------- CSV
        Leitor leitorCSV = new Leitor();
        leitorCSV.setDiretorio("src\\main\\resources");
        leitorCSV.setNomeArquivo("dados.csv");

        var dadosCSV = leitorCSV.lerArquivo();
        System.out.println(dadosCSV);

        // --------------------- Merge entre CSV e TXT
        List<Map<String, String>> dados = new ArrayList<>();
        dados.addAll(dadosTXT);
        dados.addAll(dadosCSV);
        System.out.println(dados);
    }
}
