package in.co.samples.user;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7573277067447546879L;
	private int id;
	private String name;
	private String profession;
	private Contact contact;

	public User() {

	}

	public User(int id, String name, String profession, Contact contact) {
		this.id = id;
		this.name = name;
		this.profession = profession;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Contact getContact() {
		return contact;
	}

	@XmlElement
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
