package classes;

class Pessoa {
	protected String nome;
	protected int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	Pessoa () {
		Conta_Instancias c = new Conta_Instancias();

	}

	protected Pessoa (String n, int i) {
		nome = n;
		idade = i;
	}

	protected void calculaDivisao() {
		final int zero = 0;
    final int dez = 10;
		int total;

		try{
			total = dez/zero;
			System.out.println(total);
		} catch (ArithmeticException e ) {
			  System.out.println("Erro divisao! ERRO:" + e );
		}
	}

	protected void calculaDivisao(int dividendo, int divisor) {
		int total;
		try{
			total = dividendo/divisor;
			System.out.println(total);
		} catch (ArithmeticException e ) {
			  System.out.println("Erro divisao com assinatura! ERRO:" + e );
		}
	}

	protected void printPessoa () {
		System.out.print ("Oi meu nome é : "+ nome);
		System.out.println (". Eu tenho : "+idade+ " anos");
	}

	public static void main ( String args[] ) {
		Pessoa p;

    try{
	     p = new Pessoa (args[0],20);
	     p.printPessoa();
	     p.calculaDivisao();
   	   p.calculaDivisao(10,0);
    }	catch (Exception e) {
	      System.out.println("Este programa precisa de 1 parametro. ERRO:"+ e );
    }

	}
}
