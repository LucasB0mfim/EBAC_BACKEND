/**
 * @author Lucas
 */
package br.com.lbomfim.exceptions.exemploComTela;

import javax.swing.*;

public class AppCliente {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "",
                JOptionPane.INFORMATION_MESSAGE);

        try{
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontradoException e) {
            JOptionPane.showInputDialog(null,
                    e.getMessage(), "Sair",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
