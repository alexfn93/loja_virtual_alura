package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.modelo.Produto;
import br.com.alura.jdbc.factory.ConnectionFactory;

public class TesteInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			new PersistenciaProduto(connection).salvarProduto(comoda);
		}
		System.out.println(comoda);
	}

}
