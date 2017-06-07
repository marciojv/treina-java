package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import database.ConnectionMySQL;

public class Aluno extends Pessoa {
   int matricula;

   public Aluno (String n,int i,int m) {
      this.nome  = n;
      this.idade = i;
      matricula  = m;
   }

   void printAluno () {
      this.printPessoa();
      System.out.println (". e minha matricula é: " + matricula);
   }

   public boolean validaSenha(String usuario,String senha) throws SQLException {
	   
  	   String user_database = null;
  	   String user_password = null;
  	   
	   ResultSet rs = ConnectionMySQL.executaSQL("SELECT username,password from user");
  	 
  	 while (rs.next()) {		    
  	  	  user_database = rs.getString("username");
  		  user_password = rs.getString("password");
          System.out.println ("Usuário = " + user_database);
  	  }
  	  
     if (( usuario.equals(user_database)) & ( senha.equals(user_password))) {
          return true;
      } else {
         return false;
      }
   }

   public static void main ( String args[] ) {
      Aluno a;
      a = new Aluno("Marcio",32,1001);
      a.printAluno();
      
      try {
         if (a.validaSenha("admin", "sejalivre")) {
        	 System.out.println ("autenticou..");
         }
         else {
        	 System.out.println ("Falhou...");
         }
         
      } catch(Exception e) {
    	  System.out.println ("ERRO" + e);    	  
      }
      
   }

}
