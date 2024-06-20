package ui;

import Dados.ACMERobots;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenu {
    private ACMERobots acmeRobots;
    private Aplicacao aplicacao;
    private JButton INDIVIDUAL;
    private JButton button2;
    private JButton button3;
    private JPanel principal;

    public TelaMenu(Aplicacao aplicacao, ACMERobots acmeRobots) {
        this.aplicacao=aplicacao;
        this.acmeRobots=acmeRobots;

        INDIVIDUAL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(1);
            }
        });



    }
    public JPanel getPainel() {
        return principal;
    }

}
