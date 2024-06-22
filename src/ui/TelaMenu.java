package ui;

import Dados.ACMERobots;
import Dados.Cliente;
import Dados.Individual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenu {
    private ACMERobots acmeRobots;
    private Aplicacao aplicacao;
    private JButton INDIVIDUAL;
    private JButton EMPRESARIAL;
    private JButton MOSTRAR;
    private JPanel principal;
    private JTextArea textArea1;

    public TelaMenu(Aplicacao aplicacao, ACMERobots acmeRobots) {
        this.aplicacao=aplicacao;
        this.acmeRobots=acmeRobots;

        INDIVIDUAL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aplicacao.mudaPainel(2);

            }
        });


        EMPRESARIAL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MOSTRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Cliente c : acmeRobots.getListaCliente()){
                    if(c instanceof Individual){
                        Individual a =(Individual)c;
                        textArea1.append(a.toString());
                    }
                }

            }
        });
    }
    public JPanel getPainel() {
        return principal;
    }

}
