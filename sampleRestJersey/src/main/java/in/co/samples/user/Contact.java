package in.co.samples.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="contact")
public class Contact {

	private String email;
	private String telephone;

	public Contact() {
	}
	
	public Contact(String email, String telephone) {
		this.email = email;
		this.telephone = telephone;
	}
	
	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	@XmlElement
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
