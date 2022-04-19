	package checkpoint2;

import java.sql.Date;
import java.util.List;

public class User {

	private String name;
	private String cpf;
	private String password;
	private String email;
	private String birthdate;
	private String gender;
	private List<String> instruments;
	private List<String> styles;
	
	public User(String name, String cpf, String password, String email, String birthdate, String gender, 
			List<String> instruments, List<String> styles) {
		this.name = name;
		this.cpf = cpf;
		this.password = password;
		this.email = email;
		this.birthdate = birthdate;
		this.gender = gender;
		this.instruments = instruments;
		this.styles = styles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public List<String> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<String> instruments) {
		this.instruments = instruments;
	}

	public List<String> getStyles() {
		return styles;
	}

	public void setStyles(List<String> styles) {
		this.styles = styles;
	}
	
	
	
	
	
}
