package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionMySQL {
	public static String status = "Não conectou...";
	
	public ConnectionMySQL(){	
	}	
	
	
	public static ResultSet executaConsultaSQL(String sql) throws SQLException {
        ConnectionMySQL connectionMysql = new ConnectionMySQL();	
	    Connection cm = connectionMysql.getConexaoMySQL();
	    Statement stm = cm.createStatement();
		
	    ResultSet rs = stm.executeQuery(sql);			    
		return rs;
	}
	
	public static void executaSQL(String sql) throws SQLException {
        ConnectionMySQL connectionMysql = new ConnectionMySQL();	
	    Connection cm = connectionMysql.getConexaoMySQL();
	    Statement stm = cm.createStatement();
	    stm.execute(sql);    	    
	}

	
	
	public static void fecharConexao(Connection conexao) {
		
		try {
			conexao.close();
		   System.out.println("conexao fechada");	   
		} catch (SQLException ex) {
			System.out.println("Não foi possível fechar conexao:"+ ex);
		}				
	}
	
	public static java.sql.Connection getConexaoMySQL() {
		
	
		Connection connection = null;
		String user = "root";
		String password = "sejalivre";
		String server = "localhost";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://"+server+"/livrejava", user,
					password);

		} catch (ClassNotFoundException ex) {
			System.out.println("Não foi possível encontrar a classe do Driver MySQL");
		} catch (SQLException ex2) {
			System.out.println("Não foi possível conectar ao servidor"+ ex2);
		} finally {
			//try {
				//if (connection != null)
					//connection.close();
			//} catch (SQLException ex3) {
			//}
		}
		
      return connection;
	}
}
