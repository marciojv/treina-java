package ui;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import classes.Aluno;


public class Login extends JFrame {

  private JTextField usuarioTextField;
  private JLabel usuarioLabel, passwordLabel;
  private JPasswordField passwordTextField;
  private JButton botaoLogin;
  private GridLayout gridLogin;
  private JPanel loginPanel,buttonPanel;

  public Login()
     {
        super( "Login Sistema Java" );

        Container container = getContentPane();
        container.setLayout( new FlowLayout());
        loginPanel = new JPanel();
        buttonPanel = new JPanel();

        loginPanel.setLayout( new GridLayout(3,2));
        buttonPanel.setLayout( new GridLayout(1,1));

        usuarioLabel = new JLabel( "Usuário:" );
        loginPanel.add(usuarioLabel);

        usuarioTextField = new JTextField( "Digite seu login de rede" ,20);
        loginPanel.add(usuarioTextField);

        passwordLabel = new JLabel( "Senha:" );
        loginPanel.add(passwordLabel);

        passwordTextField = new JPasswordField("",20);
        loginPanel.add( passwordTextField );

        botaoLogin = new JButton( "Login" );
        buttonPanel.add(botaoLogin, BorderLayout.CENTER);

        container.add(loginPanel);
        container.add(buttonPanel);

        ButtonHandler handler = new ButtonHandler();
        botaoLogin.addActionListener(handler);

        setSize(450, 160);
        setVisible(true);
      }

      public static void main( String args[] )
         {
            Login application = new Login();
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
         }

      private class ButtonHandler implements ActionListener {
           public void actionPerformed( ActionEvent event )
           {

            Aluno a = new Aluno(usuarioTextField.getText(),12,2222);
            
            boolean autenticou = false;
			try {
				autenticou = a.validaSenha(usuarioTextField.getText(),passwordTextField.getText());
			} catch (SQLException e) {
				e.printStackTrace();
			}
            
            if (autenticou) {
                  JOptionPane.showMessageDialog( null,"Senha OK!");
            }
            else {
              JOptionPane.showMessageDialog( null,"Senha incorreta!");
            }
           }
      }
}
