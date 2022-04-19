package checkpoint2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passwordField;
	private JPanel panel;
	private JLabel lbUserName;
	private JLabel lbPassword;
	private JButton btnLogin;
	private JButton btnCancel;
	private JPanel panel_1;
	private JButton btnNewUser;
	private JLabel lbForgotPassword;
	private Image logo;
	private ImageIcon imgIcon;
	private JLabel logoImage;
	private Icon icon;

	private int loginAttemps;

	private String password;
	private NewUser newUser;
	private JLabel lbMusicSchol;
	private static Login login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {

		loginAttemps = 0;
		newUser = new NewUser();
		password = "root";
		login = this;

		setTitle("Iniciar sess\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 529);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 47, 38));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(66, 224, 820, 230);
		contentPane.add(panel);
		panel.setLayout(null);

		lbUserName = new JLabel("Usu\u00E1rio");
		lbUserName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbUserName.setBounds(235, 53, 71, 25);
		panel.add(lbUserName);

		lbPassword = new JLabel("Senha");
		lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbPassword.setBounds(235, 105, 71, 25);
		panel.add(lbPassword);

		userField = new JTextField();
		userField.setBounds(316, 53, 244, 32);
		panel.add(userField);
		userField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(316, 105, 244, 32);
		panel.add(passwordField);
		passwordField.setColumns(10);

		btnLogin = new JButton("Entrar");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(316, 147, 113, 21);
		panel.add(btnLogin);

		btnCancel = new JButton("Cancelar");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(447, 147, 113, 21);
		panel.add(btnCancel);

		lbForgotPassword = new JLabel("Esqueci a senha");
		lbForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbForgotPassword.setBounds(377, 178, 128, 32);
		Font font = lbForgotPassword.getFont();
		Map atribute = font.getAttributes();
		atribute.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lbForgotPassword.setFont(font.deriveFont(atribute));
		lbForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(lbForgotPassword);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(66, 36, 820, 192);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		btnNewUser = new JButton("Novo Usu\u00E1rio");
		btnNewUser.setBackground(Color.LIGHT_GRAY);
		btnNewUser.setForeground(Color.BLACK);
		btnNewUser.setFont(new Font("Tahoma", Font.BOLD, 14));

		// funções

		btnNewUser.setBounds(653, 10, 157, 40);
		panel_1.add(btnNewUser);

		logoImage = new JLabel("");
		logoImage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		logoImage.setBounds(311, 0, 198, 159);
		panel_1.add(logoImage);

		icon = new ImageIcon(getClass().getResource("logo-1.png"));
		logoImage.setIcon(icon);

		lbMusicSchol = new JLabel("Escola de M\u00FAsica");
		lbMusicSchol.setBounds(356, 159, 103, 23);
		panel_1.add(lbMusicSchol);

		// eventos

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!passwordField.getText().equals(password) || !userField.getText().equals("root")) {
					loginAttemps++;
					if (loginAttemps == 3) {
						JOptionPane.showMessageDialog(rootPane, "Você não tem mais tentativas", "Encerrando Programa",
								JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(rootPane,
								"Senha ou usuário incorreto " + loginAttemps + " de 3 tentativas", "Senha incorreta",
								JOptionPane.WARNING_MESSAGE);
						passwordField.setText("");
					}

				} else {
					JOptionPane.showMessageDialog(rootPane, "Login efetuado com sucesso!", "Sucesso",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});

		// cancelar

		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userField.setText("");
				passwordField.setText("");
			}
		});

		// esqueci a senha

		lbForgotPassword.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String email = JOptionPane.showInputDialog("Informe seu email: ");
				JOptionPane.showMessageDialog(rootPane, "Email: "+ email, "", JOptionPane.INFORMATION_MESSAGE);
				String newPassword = JOptionPane.showInputDialog("Informe a nova senha");
				if(newPassword.length()<= 8 ) {
					JOptionPane.showMessageDialog(rootPane, "A senha deve conter mais do que 8 caracteres!", "Operação inválida", JOptionPane.ERROR_MESSAGE);
				}else {
					password = newPassword;
					JOptionPane.showMessageDialog(rootPane, "Senha alterada com sucesso: " + " " + password,
							"", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
				
			}
		});

		// novo usuário
		
		btnNewUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				login.setVisible(false);
				newUser.setVisible(true);
			}
		});

	}
	
	public static void setVisibleTrue() {
		
		login.setVisible(true);
	}
}
