package serializable;

import classes.*;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AlunoSerializable extends Aluno implements Serializable {
	private ObjectOutputStream output;
	
	public AlunoSerializable()
	{
		this(0,"",0);
		
	}
	
	public AlunoSerializable(int matricula, String nome, int idade) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setIdade(idade);
	}
		
	public void openFile()
	{
		try
		{
	       output = new ObjectOutputStream( new FileOutputStream("alunos.ser"));  
		}
		catch ( IOException ioException )
		{
			System.err.println("Erro ao abrir arquivo." + ioException);
		}
	}
	
	public void adicionaRegistros() throws IOException
	{
		//AlunoSerializable alunoSer;
		//alunoSer = new AlunoSerializable(this.getMatricula(),this.getNome(),this.getIdade());
		this.output.writeObject(this); 
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
