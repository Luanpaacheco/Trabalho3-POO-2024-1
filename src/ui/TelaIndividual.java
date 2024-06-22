package ui;

import Dados.ACMERobots;

import javax.swing.*;

public class TelaIndividual {
    private JPanel principal;
    private JButton button1;
    private JButton button2;
    Aplicacao aplicacao;
    ACMERobots client;
   public TelaIndividual(Aplicacao aplicacao, ACMERobots client){
       this.aplicacao=aplicacao;
       this.client=client;








   }
    public JPanel getPainel(){

       return principal;
    }
}


