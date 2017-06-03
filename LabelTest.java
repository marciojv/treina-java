import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelTest extends JFrame {

   private JLabel label1, label2, label3;

   public LabelTest()
   {
          super( "Teste JLabel" );
          Container container = getContentPane();
          container.setLayout( new FlowLayout() );

          label1 = new JLabel( "JLabel com texto" );
          label1.setToolTipText( "Isso é um Jlabel1" );
          container.add(label1);

          Icon bug = new ImageIcon( "bug1.gif" );
          label2= new JLabel("JLabel com texto e ícone",bug, SwingConstants.LEFT);
          label2.setToolTipText( "Isso é um JLabel2" );
          container.add( label2 );

          label3 = new JLabel();

          label3.setText( "JLabel com ícone e texto embaixo" );
          label3.setIcon( bug );
          label3.setHorizontalTextPosition( SwingConstants.CENTER );
          label3.setVerticalTextPosition( SwingConstants.BOTTOM );
          label3.setToolTipText( "Isso é um Jlabel3" );
          container.add( label3 );

          setSize( 275, 170 );
          setVisible( true );

   }

   public static void main( String args[] )
      {
         LabelTest application = new LabelTest();
         application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

}
