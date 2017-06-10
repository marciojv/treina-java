package br.com.ambientelivre.hack204;

import java.io.EOFException;     
import java.io.FileInputStream;  
import java.io.IOException;      
import java.io.ObjectInputStream;

import br.com.ambientelivre.hack201.*;

public class ReadSequentialFile
{
   private ObjectInputStream input;

   public void openFile()
   {
      try 
      {
         input = new ObjectInputStream(new FileInputStream( "clientes.ser" ) );
      } 
      catch ( IOException ioException )
      {
         System.err.println( "Error opening file." + ioException);
      } 
   } 


   public void readRecords()
   {
	   RegistroContaSerializable record;
      System.out.printf( "%-10s%-12s%-12s%10s\n", "Conta",
         "Primeiro Nome", "Ultimo Nome", "Saldo" );

      try 
      {
         while ( true )
         {
            record = ( RegistroContaSerializable ) input.readObject();

            System.out.printf( "%-10d%-12s%-12s%10.2f\n",  
               record.getConta(), record.getPrimeiroNome(),
               record.getSobreNome(), record.getSaldo() );
         } 
      } 
      catch ( EOFException endOfFileException )
      {
         return; 
      } 
      catch ( ClassNotFoundException classNotFoundException )
      {
         System.err.println( "Unable to create object." );
      } 
      catch ( IOException ioException )
      {
         System.err.println( "Error during reading from file." );
      } 
   } 


   public void closeFile()
   {
      try 
      {
         if ( input != null )
            input.close();
            System.exit( 0 );
      } 
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } 
   } 
} 
