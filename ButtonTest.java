import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame {
   private JButton plainButton, fancyButton;

   public ButtonTest()
   {
      super( "Testando o Button" );
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      plainButton = new JButton( "Button Plano" );
      container.add( plainButton );


      Icon bug1 = new ImageIcon( "botao.png" );
      Icon bug2 = new ImageIcon( "botao2.png" );


      fancyButton = new JButton( "Button com ícone", bug1 );
      fancyButton.setRolloverIcon( bug2 );
      container.add( fancyButton );

      ButtonHandler handler = new ButtonHandler();

      fancyButton.addActionListener( handler );
      plainButton.addActionListener( handler );

      setSize( 300, 150 );
      setVisible( true );
   }

   public static void main( String args[] )
   {
         ButtonTest application = new ButtonTest();
         application.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE );
   }

   private class ButtonHandler implements ActionListener {
         public void actionPerformed( ActionEvent event )
         {
            JOptionPane.showMessageDialog( null,
               "Você Pressionou: " + event.getActionCommand() );
         }
    }

}
