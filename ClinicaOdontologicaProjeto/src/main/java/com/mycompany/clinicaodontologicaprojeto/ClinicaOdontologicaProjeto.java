package com.mycompany.clinicaodontologicaprojeto;

import model.Funcionario;
import persistence.Dao;

public class ClinicaOdontologicaProjeto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Funcionario func = new Funcionario();
        func.setNome("Fernanda");
        Dao dao = new Dao();
        dao.salvar(func);
    }
}
