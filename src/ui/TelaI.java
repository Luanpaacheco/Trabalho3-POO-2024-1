package ui;

import Dados.ACMERobots;

import javax.swing.*;

public class TelaI {
    private JPanel principal;
    private JButton button1;
    private JButton button2;
    Aplicacao aplicacao;
    ACMERobots client;
   public TelaI(Aplicacao aplicacao, ACMERobots client){
       this.aplicacao=aplicacao;
       this.client=client;








   }
    public JPanel getPainel(){
        return principal;
    }
}


