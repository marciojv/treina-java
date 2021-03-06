import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame {
   private JTextField field;
   private JCheckBox bold, italic;
   public CheckBoxTest()   {
      super( "Teste JCheckBox" );
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );
      field = new JTextField( "Observe a alteração do estilo da fonte", 20 );
      field.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      container.add( field );
      bold = new JCheckBox( "Bold" );
      container.add( bold );
      italic = new JCheckBox( "Italic" );
      container.add( italic );
      CheckBoxHandler handler = new CheckBoxHandler();
      bold.addItemListener( handler );
      italic.addItemListener( handler );
      setSize( 275, 100 );
      setVisible( true );
   }

   public static void main( String args[] )   {
        CheckBoxTest application = new CheckBoxTest();
        application.setDefaultCloseOperation(
           JFrame.EXIT_ON_CLOSE );
     }

     private class CheckBoxHandler implements ItemListener {
        private int valBold = Font.PLAIN;
        private int valItalic = Font.PLAIN;
        public void itemStateChanged( ItemEvent event )  {

           if ( event.getSource() == bold )
              if ( event.getStateChange() == ItemEvent.SELECTED )
                 valBold = Font.BOLD;
              else
                 valBold = Font.PLAIN;

           if ( event.getSource() == italic )
              if ( event.getStateChange() == ItemEvent.SELECTED )
                 valItalic = Font.ITALIC;
              else
                 valItalic = Font.PLAIN;

           field.setFont( new Font( "Serif", valBold + valItalic, 14 ));
        }
     }

  }
