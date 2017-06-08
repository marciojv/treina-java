
import br.com.ambientelivre.hack201.RegistroContaSerializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CriaArquivoSequencial {
	private ObjectOutputStream output;
	
	public void openFile()
	{
		try
		{
	       output = new ObjectOutputStream( new FileOutputStream("clientes.ser"));  
		}
		catch ( IOException ioException )
		{
			System.err.println("Erro ao abrir arquivo." + ioException);
		}
	}
	
	public void adicionaRegistros() throws IOException
	{
		RegistroContaSerializable registro;
		int contaNumero = 0;
		String primeiroNome;
		String sobreNome;
		double saldo;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("%s\n%s\n%s\n%s\n\n",
				"Para terminar input, tipo de end-of-file indicator",
				"quando voce estiver com o prompt para entrar com dados use:",
				"no Linux <crtl> d e Pressione ENTER",
				"no Windows <crtl> z e pressione ENTER");
		
		System.out.printf("%s\n%s",
				"Entre com numero da conta( >0 ) , Nome, Sobrenome e Saldo.",
				"?");
		
		while (input.hasNext())
		{
			try
			{
				contaNumero = input.nextInt();
				primeiroNome = input.next();
				sobreNome = input.next();
				saldo = input.nextDouble();
				
				if (contaNumero > 0)
				{
					registro = new RegistroContaSerializable(contaNumero,primeiroNome,sobreNome,saldo);
					
					output.writeObject(registro); 
				}
				else {
					System.out.println("Numero da Conta maior que Zero ( 0)");					
				}
			}
			catch ( NoSuchElementException elementException ) 
			{
				System.err.println("Entrada Invalida, tente novamente");
				input.nextLine();
			}
			System.out.printf("%s %s\n%s", "Entre com numero da Conta (>0),",
					"Nome, Sobrenomee Saldo.", "? ");			
		}
		
	}
	
	public void closeFile()
	{
		try
		{
			if ( output != null) 
				output.close();	
		}
	
		catch (IOException ioException) 
		{
			 System.err.println("Erro ao fechar o arquivo");
			 System.exit(1);			 
		}
		
	}
	

		
	
	
}
