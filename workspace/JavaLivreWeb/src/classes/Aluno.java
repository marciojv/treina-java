package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import database.ConnectionMySQL;

public class Aluno extends Pessoa {
	
	private int matricula; 

	public Aluno() {
		//Conta_Instancias c = new Conta_Instancias();
		
	}

	public Aluno(String n, int i, int m) {
		this.setNome(n); // this.nome = n;
		this.setIdade(i); // this.idade = i;
		matricula = m;

	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome ;
	}

	public void setIdade(int idade) {
		this.idade = idade ;
	}
	
	protected void printAluno() {
		this.printPessoa();
		System.out.println(". e minha matricula é: " + matricula);
	}

	public boolean validaSenha(String usuario, String senha) throws SQLException {

		String user_database = null;
		String user_password = null;

		ResultSet rs = ConnectionMySQL.executaConsultaSQL("SELECT username,password from user");
      
		
		while (rs.next()) {
			user_database = rs.getString("username");
			user_password = rs.getString("password");
			System.out.println("Usuário = " + user_database);
		}
 				
		 
		if ((usuario.equals(user_database)) & (senha.equals(user_password))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Aluno a;
		a = new Aluno("Marcio", 32, 1001);
		a.printAluno();

		try {
			if (a.validaSenha("admin", "sejalivre")) {
				System.out.println("autenticou..");
			} else {
				System.out.println("Falhou...");
			}

		} catch (Exception e) {
			System.out.println("ERRO" + e);
		}

	}

	public void gravaAluno() {
		
		
		String sql = "INSERT INTO Aluno "
				+ "VALUES("
				+ this.matricula + ","
				+ "'" + this.getNome() + "',"
				+ this.getIdade() + ")";

		try {
			ConnectionMySQL.executaSQL(sql);		   
		} catch(SQLException e) {
			System.out.println("ERRO Insercao Aluno" + e + " SQL: " + sql);
		}
	}
		

}
