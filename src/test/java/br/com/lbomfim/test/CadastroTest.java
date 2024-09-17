package br.com.lbomfim.test;

import org.junit.Test;

import br.com.lbomfim.dao.CarroDAO;
import br.com.lbomfim.dao.MarcaDAO;
import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Acessorio;
import br.com.lbomfim.domain.Carro;
import br.com.lbomfim.domain.Marca;

/**
 * @author Lucas Bomfim
 */

public class CadastroTest {

    private IGenericDAO<Marca> marcaDAO;
    private IGenericDAO<Carro> carroDAO;

    public CadastroTest() {
        marcaDAO = new MarcaDAO();
        carroDAO = new CarroDAO();
    }

    @Test
    public void cadastrar() throws Exception {
        // CRIAR MARCA
        Marca marca = new Marca();
        marca.setNome("NISSAN");

        // CADASTRAR MARCA
        marca = marcaDAO.cadastrar(marca);

        // CRIAR CARRO
        Carro carro = new Carro();
        carro.setModelo("SKYLINE");
        marca.adicionarCarro(carro);

        // CRIAR ACESSORIO (1)
        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("FIXADOR");
        carro.adicionarAcessorio(acessorio1);

        // CRIAR ACESSORIO 21)
        Acessorio acessorio2 = new Acessorio();
        acessorio2.setNome("ESCAPAMENTO ESPORTIVO");
        carro.adicionarAcessorio(acessorio2);

        // CADASTRAR CARRO
        carroDAO.cadastrar(carro);
    }
}

