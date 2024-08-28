package com.gabrielluciano.solid.isp.refactor.dao;

import com.gabrielluciano.solid.isp.refactor.BD;
import com.gabrielluciano.solid.isp.refactor.interfaces.Cadastro;

public class ContratoModel extends BD implements Cadastro {

    @Override
    public void salvar() {
        System.out.println("Salvando contrato!");
    }
}
