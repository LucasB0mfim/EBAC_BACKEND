package br.com.lbomfim.dao;

import java.sql.Connection; // Conexão com o banco de dados
import java.sql.PreparedStatement; // Comando SQL preparado
import java.sql.ResultSet; // Resultados da consulta SQL
import java.util.ArrayList; // Lista dinâmica
import java.util.List; // Lista de clientes

import br.com.lbomfim.dao.jdbc.ConnectionFactory; // Fábrica de conexões
import br.com.lbomfim.domain.Cliente; // Classe Cliente

public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {
        Connection conexao = null; // Conexão com o banco de dados
        PreparedStatement comandoSQL = null; // Comando SQL preparado
        
        try {
            // Obtém a conexão com o banco de dados
            conexao = ConnectionFactory.getConnection();	
            
            // SQL para inserir um novo cliente
            String sql = "INSERT INTO TB_CLIENTE_2 (ID, CODIGO, NOME) VALUES (nextval('SQ_CLIENTE_2'),?,?)";
            
            // Prepara o comando SQL
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, cliente.getCodigo()); // Define o código do cliente
            comandoSQL.setString(2, cliente.getNome()); // Define o nome do cliente
            
            // Executa o comando e retorna o número de linhas afetadas
            return comandoSQL.executeUpdate();
            
        } catch (Exception e) {
            throw e; // Lança a exceção para tratamento externo
        } finally {
            // Fecha o comando preparado e a conexão
            if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    @Override
    public Cliente consultar(String codigo) throws Exception {
        
    	Connection conexao = null; // Conexão com o banco de dados
        PreparedStatement comandoSQL = null; // Comando SQL preparado
        ResultSet resultados = null; // Resultados da consulta SQL
        Cliente cliente = null; // Cliente retornado
        
        try {
            // Obtém a conexão com o banco de dados
            conexao = ConnectionFactory.getConnection();	
            
            // SQL para consultar um cliente pelo código
            String sql = "SELECT * FROM TB_CLIENTE_2 WHERE CODIGO = ?";
            
            // Prepara o comando SQL
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, codigo); // Define o código para consulta
            resultados = comandoSQL.executeQuery(); // Executa a consulta
            
            // Se houver resultados, cria um objeto Cliente
            if (resultados.next()) {
                cliente = new Cliente();
                cliente.setId(resultados.getLong("id")); // Define o ID do cliente
                cliente.setCodigo(resultados.getString("codigo")); // Define o código do cliente
                cliente.setNome(resultados.getString("nome")); // Define o nome do cliente
            }
            
            return cliente; // Retorna o cliente encontrado
            
        } catch (Exception e) {
            throw e; // Lança a exceção para tratamento externo
        } finally {
            // Fecha o comando preparado, os resultados e a conexão
            if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (resultados != null && !resultados.isClosed()) {
                resultados.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    @Override
    public Integer excluir(Cliente clienteBD) throws Exception {
        
    	Connection conexao = null; // Conexão com o banco de dados
        PreparedStatement comandoSQL = null; // Comando SQL preparado
        
        try {
            // Obtém a conexão com o banco de dados
            conexao = ConnectionFactory.getConnection();	
            
            // SQL para excluir um cliente pelo código
            String sql = "DELETE FROM TB_CLIENTE_2 WHERE CODIGO = ?";
            
            // Prepara o comando SQL
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, clienteBD.getCodigo()); // Define o código para exclusão
            
            // Executa o comando e retorna o número de linhas afetadas
            return comandoSQL.executeUpdate();
            
        } catch (Exception e) {
            throw e; // Lança a exceção para tratamento externo
        } finally {
            // Fecha o comando preparado e a conexão
            if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        
    	Connection conexao = null; // Conexão com o banco de dados
        PreparedStatement comandoSQL = null; // Comando SQL preparado
        ResultSet resultados = null; // Resultados da consulta SQL
        List<Cliente> listaClientes = new ArrayList<>(); // Lista de clientes
        
        try {
            // Obtém a conexão com o banco de dados
            conexao = ConnectionFactory.getConnection();	
            
            // SQL para buscar todos os clientes
            String sql = "SELECT * FROM TB_CLIENTE_2";
            
            // Prepara o comando SQL
            comandoSQL = conexao.prepareStatement(sql);
            resultados = comandoSQL.executeQuery(); // Executa a consulta
            
            // Itera sobre os resultados e adiciona os clientes na lista
            while (resultados.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultados.getLong("id")); // Define o ID do cliente
                cliente.setCodigo(resultados.getString("codigo")); // Define o código do cliente
                cliente.setNome(resultados.getString("nome")); // Define o nome do cliente
                listaClientes.add(cliente); // Adiciona o cliente à lista
            }
            
            return listaClientes; // Retorna a lista de clientes
            
        } catch (Exception e) {
            throw e; // Lança a exceção para tratamento externo
        } finally {
            // Fecha o comando preparado, os resultados e a conexão
            if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (resultados != null && !resultados.isClosed()) {
                resultados.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

    @Override
    public Integer atualizar(Cliente cliente) throws Exception {
        
    	Connection conexao = null; // Conexão com o banco de dados
        PreparedStatement comandoSQL = null; // Comando SQL preparado
        
        try {
            // Obtém a conexão com o banco de dados
            conexao = ConnectionFactory.getConnection();	
            
            // SQL para atualizar o nome de um cliente pelo código
            String sql = "UPDATE TB_CLIENTE_2 SET NOME = ? WHERE CODIGO = ?";
            
            // Prepara o comando SQL
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setString(1, cliente.getNome()); // Define o novo nome do cliente
            comandoSQL.setString(2, cliente.getCodigo()); // Define o código para a atualização
            
            // Executa o comando e retorna o número de linhas afetadas
            return comandoSQL.executeUpdate();
            
        } catch (Exception e) {
            throw e; // Lança a exceção para tratamento externo
        } finally {
            // Fecha o comando preparado e a conexão
            if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }
}
