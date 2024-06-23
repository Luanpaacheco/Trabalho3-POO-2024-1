package ui;

import Dados.ACMERobots;
import Dados.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

public class TelaMenu {
    private ACMERobots acmeRobots;
    private Aplicacao aplicacao;
    private JButton INDIVIDUAL;
    private JButton EMPRESARIAL;
    private JButton MOSTRAR;
    private JPanel principal;
    private JTextArea textArea1;
    private JLabel Legenda;
    private JButton limpar;

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
                aplicacao.mudaPainel(3);
            }
        });
        MOSTRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(acmeRobots.getListaCliente().isEmpty()){
                    JOptionPane.showMessageDialog(aplicacao,"cadastre pelo menos um cliente!");
                }else {
                    textArea1.setText("");
                    acmeRobots.getListaCliente().stream().sorted(Comparator.comparingInt(Cliente::getCodigo)).forEach(a-> textArea1.append(a.toString()+"\n"));
                }

            }
        });
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }
    public JPanel getPainel() {
        return principal;
    }

}
