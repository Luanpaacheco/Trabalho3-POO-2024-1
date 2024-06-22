package ui;

import Dados.ACMERobots;

import javax.swing.*;

public class TelaEmpresarial {
    private Aplicacao aplicacao;
    private ACMERobots client;
    private JPanel principal;

    public TelaEmpresarial(Aplicacao aplicacao, ACMERobots client){
        this.aplicacao=aplicacao;
        this.client=client;



    }

    public JPanel getPainel(){
        return principal;
    }
}
