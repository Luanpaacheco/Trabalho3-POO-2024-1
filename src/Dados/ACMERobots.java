package Dados;

import ui.TelaMenu;

import java.util.ArrayList;
import java.util.List;

public class ACMERobots {
    private List<Cliente>clientes;
    public ACMERobots() {

        this.clientes = new ArrayList<>();
    }

    public boolean cadastraCliente(Cliente cliente) {
        if(consultaCodigo(cliente.getCodigo())==null){
            clientes.add(cliente);
            return true;
        }
        else
            return false;
    }

    public Cliente consultaCodigo(int codigo) {

       for (Cliente c : clientes){
           if(c.getCodigo()==codigo){
               return c;
           }
       } return null;
    }

    public List<Cliente> getListaCliente() {
        return clientes;
    }
}
