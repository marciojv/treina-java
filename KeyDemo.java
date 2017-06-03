import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyDemo extends JFrame implements KeyListener {
   private String line1 = "", line2 = "";
   private String line3 = "";
   private JTextArea textArea;
   public KeyDemo()   {
      super( "Demonstreando Eventos do Teclado" );
      textArea = new JTextArea( 10, 15 );
      textArea.setText( "Pressionada alguma tecla..." );
      textArea.setEnabled( false );
      getContentPane().add( textArea );
      addKeyListener( this );
      setSize( 350, 100 );
      setVisible( true );
   }

   public void keyPressed( KeyEvent event )   {
         line1 = "Tecla pressionada: " + event.getKeyText( event.getKeyCode() );
         setLines2and3( event );
    }

    public void keyReleased( KeyEvent event )   {
         line1 = "Tecla released: " +  event.getKeyText( event.getKeyCode() );
         setLines2and3( event );
    }

    public void keyTyped( KeyEvent event )   {
         line1 = "Tecla typed: " + event.getKeyChar();
         setLines2and3( event );
    }

    private void setLines2and3( KeyEvent event )   {
        line2 = "A Tecla está " + ( event.isActionKey() ? "" : "Não " ) +
           " é uma tecla de ação";
        String temp = event.getKeyModifiersText( event.getModifiers() );
        line3 = "Teclas pressionada: " + ( temp.equals( "" ) ? "none" : temp );
        textArea.setText( line1 + "\n" + line2 + "\n" + line3 + "\n" );
      }

     public static void main( String args[] )   {
        KeyDemo application = new KeyDemo();
        application.setDefaultCloseOperation(
           JFrame.EXIT_ON_CLOSE );
     }

}
