package checkpoint2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField cpf;
	private JPasswordField password;
	private JTextField email;
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JPasswordField confirmPassword;
	private ButtonGroup radioGroup;
	private JTextField otherInstrumentField;
	private JTextField otherStyleField;
	private JPanel panel;
	private JLabel lbGender;
	private JLabel lbPassword;
	private JLabel lbCpf;
	private JLabel lbName;
	private JLabel lbPasswordConfirm;
	private JLabel lbBirth;
	private JLabel lbEmail;
	private JLabel lbMonth;
	private JLabel lbDay;
	private JLabel lbYear;
	private JRadioButton rdFemale;
	private JRadioButton rdMale;
	private JRadioButton rdOther;
	private JPanel panel_1;
	private JLabel lbInstrument;
	private JLabel lbStyles;
	private JCheckBox cbGuitar;
	private JCheckBox cbEletricGuitar;
	private JCheckBox cbPiano;
	private JCheckBox cbDrums;
	private JCheckBox cbBass;
	private JCheckBox cbSax;
	private JCheckBox cbTrompet;
	private JLabel lbOtherInstrument;
	private JCheckBox cbRock;
	private JCheckBox cbSamba;
	private JCheckBox cbPop;
	private JCheckBox cbRap;
	private JCheckBox cbReagge;
	private JCheckBox cbBlues;
	private JCheckBox cbJazz;
	private JLabel lbOtherStyle;
	private JButton btnOtherInstrument;
	private JButton btnOtherStyle;
	private JButton btnBack;
	private JButton btnClear;
	private JButton btnSave;

	private String genderString;
	private List<String> instrumentsList;
	private List<String> stylesList;

	public NewUser() {

		instrumentsList = new LinkedList();
		stylesList = new LinkedList();

		this.setVisible(false);
		this.setTitle("Novo Usuário");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1137, 653);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 47, 38));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 44, 1093, 221);
		contentPane.add(panel);
		panel.setLayout(null);

		lbGender = new JLabel("G\u00EAnero*");
		lbGender.setBounds(481, 171, 68, 23);
		panel.add(lbGender);
		lbGender.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbPassword = new JLabel("Senha*");
		lbPassword.setBounds(10, 122, 156, 23);
		panel.add(lbPassword);
		lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbCpf = new JLabel("CPF*");
		lbCpf.setBounds(10, 74, 156, 23);
		panel.add(lbCpf);
		lbCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbName = new JLabel("Nome*");
		lbName.setBounds(10, 24, 104, 23);
		panel.add(lbName);
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbPasswordConfirm = new JLabel("Confirmar Senha*");
		lbPasswordConfirm.setBounds(10, 171, 156, 23);
		panel.add(lbPasswordConfirm);
		lbPasswordConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbBirth = new JLabel("Data de Nascimento*");
		lbBirth.setBounds(481, 74, 156, 23);
		panel.add(lbBirth);
		lbBirth.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbEmail = new JLabel("Email*");
		lbEmail.setBounds(481, 24, 104, 23);
		panel.add(lbEmail);
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));

		name = new JTextField();
		name.setBounds(88, 24, 352, 23);
		panel.add(name);
		name.setColumns(10);

		cpf = new JTextField();
		cpf.setBounds(88, 74, 352, 23);
		panel.add(cpf);
		cpf.setColumns(10);

		password = new JPasswordField();
		password.setBounds(88, 122, 352, 23);
		panel.add(password);

		email = new JTextField();
		email.setBounds(548, 24, 348, 23);
		panel.add(email);
		email.setColumns(10);

		lbMonth = new JLabel("Mês");
		lbMonth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbMonth.setBounds(572, 107, 29, 13);
		panel.add(lbMonth);

		lbDay = new JLabel("Dia");
		lbDay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbDay.setBounds(481, 107, 29, 13);
		panel.add(lbDay);

		lbYear = new JLabel("Ano");
		lbYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbYear.setBounds(679, 107, 29, 13);
		panel.add(lbYear);

		day = new JTextField();
		day.setBounds(508, 104, 44, 23);
		panel.add(day);
		day.setColumns(10);

		month = new JTextField();
		month.setBounds(611, 104, 44, 23);
		panel.add(month);
		month.setColumns(10);

		year = new JTextField();
		year.setBounds(718, 104, 49, 23);
		panel.add(year);
		year.setColumns(10);

		confirmPassword = new JPasswordField();
		confirmPassword.setBounds(141, 171, 299, 23);
		panel.add(confirmPassword);

		rdFemale = new JRadioButton("Feminino");
		rdFemale.setBounds(552, 174, 79, 21);
		panel.add(rdFemale);

		rdMale = new JRadioButton("Masculino");
		rdMale.setBounds(658, 174, 97, 21);
		panel.add(rdMale);

		rdOther = new JRadioButton("Outro");
		rdOther.setBounds(781, 174, 68, 21);
		panel.add(rdOther);

		radioGroup = new ButtonGroup();
		radioGroup.add(rdFemale);
		radioGroup.add(rdMale);
		radioGroup.add(rdOther);

		rdFemale.addItemListener(new RadioButtonHandler("Feminino"));
		rdMale.addItemListener(new RadioButtonHandler("Masculino"));
		rdOther.addItemListener(new RadioButtonHandler("Outro"));
		
		
		

		// instrumentos #########################

		panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(20, 275, 1093, 267);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lbInstrument = new JLabel("Instrumentos que pratica");
		lbInstrument.setBounds(22, 27, 243, 20);
		panel_1.add(lbInstrument);
		lbInstrument.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbStyles = new JLabel("Estilos que pratica");
		lbStyles.setBounds(534, 26, 156, 23);
		panel_1.add(lbStyles);
		lbStyles.setFont(new Font("Tahoma", Font.PLAIN, 16));

		cbGuitar = new JCheckBox("Violão");
		cbGuitar.setBounds(22, 76, 93, 21);
		panel_1.add(cbGuitar);

		cbEletricGuitar = new JCheckBox("Guitarra");
		cbEletricGuitar.setBounds(22, 109, 93, 21);
		panel_1.add(cbEletricGuitar);

		cbPiano = new JCheckBox("Piano");
		cbPiano.setBounds(22, 142, 93, 21);
		panel_1.add(cbPiano);

		cbDrums = new JCheckBox("Bateria");
		cbDrums.setBounds(133, 142, 93, 21);
		panel_1.add(cbDrums);

		cbBass = new JCheckBox("Baixo");
		cbBass.setBounds(22, 177, 93, 21);
		panel_1.add(cbBass);

		cbSax = new JCheckBox("Sax");
		cbSax.setBounds(133, 76, 93, 21);
		panel_1.add(cbSax);

		cbTrompet = new JCheckBox("Trompete");
		cbTrompet.setBounds(133, 109, 93, 21);
		panel_1.add(cbTrompet);

		lbOtherInstrument = new JLabel("Outro:");
		lbOtherInstrument.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbOtherInstrument.setBounds(133, 179, 57, 13);
		panel_1.add(lbOtherInstrument);

		otherInstrumentField = new JTextField();
		otherInstrumentField.setBounds(183, 178, 182, 19);
		panel_1.add(otherInstrumentField);
		otherInstrumentField.setColumns(10);

		cbGuitar.addItemListener(new InstrumentsCheckBoxHandler("Violão", cbGuitar));
		cbEletricGuitar.addItemListener(new InstrumentsCheckBoxHandler("Guitarra", cbEletricGuitar));
		cbPiano.addItemListener(new InstrumentsCheckBoxHandler("Piano", cbPiano));
		cbDrums.addItemListener(new InstrumentsCheckBoxHandler("Bateria", cbDrums));
		cbBass.addItemListener(new InstrumentsCheckBoxHandler("Baixo", cbBass));
		cbSax.addItemListener(new InstrumentsCheckBoxHandler("Sax", cbSax));
		cbTrompet.addItemListener(new InstrumentsCheckBoxHandler("Trompete", cbTrompet));
		
		
		
		

		// estilos #########################
		
		

		cbRock = new JCheckBox("Rock");
		cbRock.setBounds(534, 76, 93, 21);
		panel_1.add(cbRock);

		cbSamba = new JCheckBox("Samba");
		cbSamba.setBounds(534, 142, 93, 21);
		panel_1.add(cbSamba);

		cbPop = new JCheckBox("Pop");
		cbPop.setBounds(646, 109, 93, 21);
		panel_1.add(cbPop);

		cbRap = new JCheckBox("Rap");
		cbRap.setBounds(534, 177, 93, 21);
		panel_1.add(cbRap);

		cbReagge = new JCheckBox("Reagge");
		cbReagge.setBounds(646, 142, 93, 21);
		panel_1.add(cbReagge);

		cbBlues = new JCheckBox("Blues");
		cbBlues.setBounds(534, 109, 93, 21);
		panel_1.add(cbBlues);

		cbJazz = new JCheckBox("Jazz");
		cbJazz.setBounds(646, 76, 93, 21);
		panel_1.add(cbJazz);

		lbOtherStyle = new JLabel("Outro:");
		lbOtherStyle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbOtherStyle.setBounds(646, 179, 57, 13);
		panel_1.add(lbOtherStyle);

		otherStyleField = new JTextField();
		otherStyleField.setBounds(697, 178, 182, 19);
		panel_1.add(otherStyleField);
		otherStyleField.setColumns(10);
		
		
		cbRock.addItemListener(new StylesCheckBoxHandler("Rock", cbRock));
		cbSamba.addItemListener(new StylesCheckBoxHandler("Samba", cbSamba));
		cbPop.addItemListener(new StylesCheckBoxHandler("Pop", cbPop));
		cbRap.addItemListener(new StylesCheckBoxHandler("Rap", cbRap));
		cbBlues.addItemListener(new StylesCheckBoxHandler("Blues", cbBlues));
		cbJazz.addItemListener(new StylesCheckBoxHandler("Jazz", cbJazz));
		cbReagge.addItemListener(new StylesCheckBoxHandler("Reagge", cbReagge));
		
		
		
		

		btnOtherInstrument = new JButton("Adicionar");
		btnOtherInstrument.setBounds(375, 177, 103, 21);
		panel_1.add(btnOtherInstrument);

		btnOtherStyle = new JButton("Adicionar");
		btnOtherStyle.setBounds(889, 177, 103, 21);
		panel_1.add(btnOtherStyle);

		btnBack = new JButton("Voltar");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.GRAY);
		btnBack.setBounds(20, 10, 85, 21);
		contentPane.add(btnBack);

		btnClear = new JButton("Limpar");
		btnClear.setForeground(Color.WHITE);
		btnClear.setBackground(Color.GRAY);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBounds(20, 552, 170, 42);
		contentPane.add(btnClear);

		btnSave = new JButton("salvar");
		btnSave.setForeground(Color.WHITE);
		btnSave.setBackground(Color.BLACK);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(943, 552, 170, 42);
		contentPane.add(btnSave);

		// FUNÇÕES ###########################################################
		
		//add instrumento
		
		btnOtherInstrument.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				instrumentsList.add(otherInstrumentField.getText());
				otherInstrumentField.setText("");
			}
		});
		
		
		//add estilos
		
				btnOtherStyle.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						stylesList.add(otherStyleField.getText());
						otherStyleField.setText("");
					}
				});
		
		
		
		

		// voltar
				
				
			
			

		NewUser newUser = this;
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login.setVisibleTrue();
				newUser.setVisible(false);
			}
		});

		// limpar

		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				cpf.setText("");
				password.setText("");
				confirmPassword.setText("");
				email.setText("");
				day.setText("");
				month.setText("");
				year.setText("");
				cbGuitar.setSelected(false);
				cbEletricGuitar.setSelected(false);
				cbPiano.setSelected(false);
				cbBass.setSelected(false);
				cbSax.setSelected(false);
				cbTrompet.setSelected(false);
				cbDrums.setSelected(false);
				otherInstrumentField.setText("");
				cbRock.setSelected(false);
				cbBlues.setSelected(false);
				cbJazz.setSelected(false);
				cbReagge.setSelected(false);
				cbSamba.setSelected(false);
				cbPop.setSelected(false);
				cbRap.setSelected(false);
				otherStyleField.setText("");
			}
		});
		
		
		//salvar

		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!formValid().equals("")) {
					JOptionPane.showMessageDialog(newUser, formValid(), "Formulário Invalido",
							JOptionPane.ERROR_MESSAGE);
				} else {

					String birthdate = day.getText() + "/" + month.getText() + "/" + year.getText();

					User user = new User(name.getText(), cpf.getText(), password.getText(),
							 email.getText(), birthdate, genderString, instrumentsList, stylesList);
					 
					
					XStream xstream = new XStream(new DomDriver());
					
					saveXMLFile(xstream.toXML(user), user);
					
					JOptionPane.showMessageDialog(newUser, "Usuário cadastrado com sucesso!");
					
					newUser.setVisible(false);
					
				}

			}
		});

	}
	
	
	
	

	// ###########################################################################################################################

	private class RadioButtonHandler implements ItemListener {

		private String string;

		public RadioButtonHandler(String gender) {
			string = gender;
		}

		public void itemStateChanged(ItemEvent e) {
			genderString = string;
		}
	}
	
	
	// #######################################
	

	private class InstrumentsCheckBoxHandler implements ItemListener {

		private String instrument;
		private JCheckBox checkBox;

		public InstrumentsCheckBoxHandler(String inst, JCheckBox cb) {
			instrument = inst;
			checkBox = cb;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (checkBox.isSelected())
				instrumentsList.add(instrument);
			else
				instrumentsList.remove(instrument);
		}
	}
	
	// #######################################

	private class StylesCheckBoxHandler implements ItemListener {

		private String style;
		private JCheckBox checkBox;

		public StylesCheckBoxHandler(String st, JCheckBox cb) {
			style = st;
			checkBox = cb;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (checkBox.isSelected())
				stylesList.add(style);
			else
				stylesList.remove(style);
		}
	}
	
	// #######################################

	private String formValid() {
		if (name.getText().equals("") || cpf.getText().equals("") || email.getText().equals("")
				|| password.getText().equals("") || confirmPassword.getText().equals("") || day.getText().equals("")
				|| month.getText().equals("") || year.getText().equals("")) {

			return "Preencha todos os campos orbigatórios";
		} else if (!password.getText().equals(confirmPassword.getText())) {

			return "As senhas não são iguais";
		} else if (password.getText().length() < 8) {
			return "Senha deve ter mais que 8 caracteres";
		}
		return "";
	}
	
	
	
	private void saveXMLFile(String xmlString, User user) {
		try {
			FileWriter stream = new FileWriter("D:\\Beto Porto\\FIAP\\2-ANO\\java\\arquivos-exemplos-aula\\"+user.getName()+"-"+user.getCpf()+".xml");
			PrintWriter write = new PrintWriter(stream);
			
			write.println(xmlString);
			
			write.close();
			stream.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
