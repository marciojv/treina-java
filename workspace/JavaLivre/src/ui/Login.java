package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import classes.Aluno;
import serializable.*;


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

        	AlunoSerializable ab = new AlunoSerializable();
            ab.setMatricula(Integer.parseInt("107"));
            ab.setNome("Joao");
            ab.setIdade(Integer.parseInt("32"));           
            ab.gravaAluno();
            try {
            	ab.openFile();
				ab.adicionaRegistros();
				ab.closeFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            //a.setNome(nome);
            
            // Exemplo Casting de String para Int
            // int intRetorno = Integer.parseInt(usuarioTextField.getText());
            
            boolean autenticou = false;
			try {
				autenticou = ab.validaSenha(usuarioTextField.getText(),passwordTextField.getText());
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
