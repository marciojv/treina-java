import java.io.IOException;

public class CriaArquivoSequencialTest {

	
	public static void main (String args[]) throws IOException
	{
		CriaArquivoSequencial application = new CriaArquivoSequencial();
		
		application.openFile();
		application.adicionaRegistros();
		application.closeFile();
		
	}
	
}
