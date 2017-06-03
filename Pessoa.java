
class Pessoa {
	String nome;
	int idade;

	Pessoa (String n, int i) {
		nome = n;
		idade = i;
	}

	void printPessoa () {
		System.out.print ("Oi meu nome é : "+ nome);
		System.out.println (". Eu tenho : "+idade+ " anos");
	}
	public static void main ( String args[] ) {
		Pessoa p;
		p = new Pessoa (args[0], 20 );
		p.printPessoa();
	}
}
