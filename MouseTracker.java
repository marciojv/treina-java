import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseTracker extends JFrame
   implements MouseListener, MouseMotionListener {
   private JLabel statusBar;
   public MouseTracker()   {
      super( "Demonstrar Eventos do Mouse" );
      statusBar = new JLabel();
      getContentPane().add( statusBar, BorderLayout.SOUTH );
      addMouseListener( this );
      addMouseMotionListener( this );
      setSize( 275, 100 );
      setVisible( true );
   }

   public void mouseClicked( MouseEvent event )   {
         statusBar.setText( "Mouse liberado imediatamente! [" + event.getX() +
            ", " + event.getY() + "]" );
      }
      public void mousePressed( MouseEvent event )   {
         statusBar.setText( "Mouse Pressionado [" + event.getX() +
            ", " + event.getY() + "]" );
      }

      public void mouseReleased( MouseEvent event )   {
            statusBar.setText( "Mouse liberador após arrastado [" + event.getX() +
               ", " + event.getY() + "]" );
         }

         public void mouseEntered( MouseEvent event )   {
            //JOptionPane.showMessageDialog( null, "Mouse entra na área da janela" );
         }
         public void mouseExited( MouseEvent event )   {
            statusBar.setText( "Mouse sai da área da janela na tela" );
         }
         public void mouseDragged( MouseEvent event )   {
            statusBar.setText( "Mouse arrastado pressionado [" + event.getX() +
               ", " + event.getY() + "]" );
         }

         public void mouseMoved( MouseEvent event )   {
              statusBar.setText( "Mouse sendo Movimentado [" + event.getX() +
                 ", " + event.getY() + "]" );
           }

           public static void main( String args[] )   {
                 MouseTracker application = new MouseTracker();
                 application.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE );
              }
 }
