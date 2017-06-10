import java.io.IOException;

public class CriaArquivoSequencialTest {

	
	public static void main (String args[]) throws IOException
	{
		CriaArquivoSequencial application = new CriaArquivoSequencial();
		
		System.out.println("nome do arquivo:"+args[0]);
		
		application.openFile();
		application.adicionaRegistros();
		application.closeFile();
		
	}
	
}
