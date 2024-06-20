package ui;

import Dados.ACMERobots;

import javax.swing.*;

public class Aplicacao extends JFrame {
    ACMERobots clientes = new ACMERobots();
    private TelaMenu telaMenu = new TelaMenu(this,clientes);
    private TelaI telaI = new TelaI(this,clientes);



    public Aplicacao(){
        super();
        JPanel painel = telaMenu.getPainel();
        add(painel);
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void mudaPainel(int painel) {
        switch(painel) {
            case 1:
                this.setContentPane(telaI.getPainel());
                this.pack();
                this.setSize(1000,800);
                break;
            case 2:

            case 3:

        }
    }
}
