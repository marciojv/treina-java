class Aluno extends Pessoa {
   int matricula;

   Aluno (String n,int i,int m) {
      this.nome  = n;
      this.idade = i;
      matricula  = m;
   }

   void printAluno () {
      this.printPessoa();
      System.out.println (". e minha matricula é: " + matricula);
   }

   public boolean validaSenha(String usuario,String senha) {

     if (( usuario.equals("marcio")) & ( senha.equals("sejalivre"))) {
          return true;
      } else {
         return false;
      }
   }

   public static void main ( String args[] ) {
      Aluno a;
      a = new Aluno("Marcio",32,1001);
      a.printAluno();
   }

}
