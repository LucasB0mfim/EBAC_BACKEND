package br.com.lbomfim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.lbomfim.dao.jdbc.ConnectionFactory;
import br.com.lbomfim.domain.Produto;

public class ProdutoDAO implements IProdutoDAO{

	@Override
	public Integer cadastrar(Produto produto) throws Exception {
		
		Connection conexao = null;
		PreparedStatement comandoSQL = null;
		
		try {
			
			conexao = ConnectionFactory.getConnection();
			String sql = "INSERT INTO TB_PRODUTO (ID, CODIGO, NOME, VALOR) VALUES (nextval('SQ_CLIENTE_2'),?,?,?)";
			
			comandoSQL = conexao.prepareStatement(sql);
			comandoSQL.setNString(1, produto.getCodigo());
			comandoSQL.setNString(2, produto.getNome());
			comandoSQL.setNString(3, produto.getValor());
			
			return comandoSQL.executeUpdate();
			
		} catch (Exception e){
			
			throw e;
			
		} finally {
			
			if (comandoSQL != null && !comandoSQL.isClosed()) {
				comandoSQL.close();
			}
			
			if (conexao != null && !conexao.isClosed()) {
				conexao.close();
			}
		}
	}

	@Override
	public Produto consultar(String codigo) throws Exception {
		Connection conexao = null;
		PreparedStatement comandoSQL = null;
		ResultSet resultado = null;
		Produto produto = null;
		
		try {
			conexao = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM TB_PRODUTO WHERE CODIGO = ?";
			
			comandoSQL = conexao.prepareStatement(sql);
			comandoSQL.setString(1, produto.getCodigo());
			resultado = comandoSQL.executeQuery();
			
			if (resultado.next()) {
				produto = new Produto();
				produto.setId(resultado.getLong("id"));
				produto.setCodigo(resultado.getString("codigo"));
				produto.setNome(resultado.getString("nome"));
				produto.setValor(resultado.getString("valor"));
			}
			
			return produto;
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (resultado != null && !resultado.isClosed()) {
                resultado.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
		}
	}

	@Override
	public Integer atualizar(Produto produto) throws Exception {
		Connection conexao = null;
		PreparedStatement comandoSQL = null;
		
		try {
			conexao = ConnectionFactory.getConnection();
			String sql = "UPDATE TB_PRODUTO SET NOME = ? WHERE CODIGO = ?";
			
			comandoSQL = conexao.prepareStatement(sql);
			comandoSQL.setString(1, produto.getCodigo());
			comandoSQL.setString(2, produto.getNome());
			
			return comandoSQL.executeUpdate();
			
		} catch (Exception e) {
			throw e;
			
		} finally {
			if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
		}
	}

	@Override
	public List<Produto> buscarTodos() throws Exception {
		Connection conexao = null;
		PreparedStatement comandoSQL = null;
		ResultSet resultado = null;
		List<Produto> lista = new ArrayList<>();
		
		try {
			conexao = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM TB_PRODUTO";
			
			comandoSQL = conexao.prepareStatement(sql);
			resultado = comandoSQL.executeQuery();
			
			while (resultado.next()) {
				Produto produto = new Produto();
				produto.setId(resultado.getLong("id"));
				produto.setCodigo(resultado.getString("codigo"));
				produto.setNome(resultado.getString("nome"));
				produto.setValor(resultado.getString("valor"));
				
				lista.add(produto);
			}
			
			return lista;
			
		} catch (Exception e) {
			throw e;
			
		} finally {
			if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (resultado != null && !resultado.isClosed()) {
            	resultado.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
		}
	}

	@Override
	public Integer excluir(Produto produtoBD) throws Exception {
		Connection conexao = null;
		PreparedStatement comandoSQL = null;
		
		try {
			conexao = ConnectionFactory.getConnection();
			String sql = "DELETE FROM TB_PRODUTO WHERE CODIGO = ?";
			
			comandoSQL = conexao.prepareStatement(sql);
			comandoSQL.setString(1, produtoBD.getCodigo());
			
			return comandoSQL.executeUpdate();
			
		} catch (Exception e) {
			throw e;
			
		} finally {
			if (comandoSQL != null && !comandoSQL.isClosed()) {
                comandoSQL.close();
            }
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
		}
	}

}
