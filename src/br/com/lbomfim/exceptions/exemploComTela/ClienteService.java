/**
 * @author Lucas
 */
package br.com.lbomfim.exceptions.exemploComTela;

public class ClienteService {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        ClienteDAO.consultarCliente(codigo);
    }
}
