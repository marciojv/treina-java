
import java.io.IOException;

import br.com.ambientelivre.hack204.*;

public class ReadSequentialFileTest {

	public static void main( String args[] )  throws IOException
	   {
	      ReadSequentialFile application = new ReadSequentialFile();

	      application.openFile();
	      application.readRecords();
	      application.closeFile();
	   } 
}
