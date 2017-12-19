package in.co.samples.beans;

import java.io.Serializable;

public class MemberData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1636544901150377413L;

	private String name;

	private String email;

	private boolean selected;

	public MemberData(String name, String email, boolean selected) {
		this.name = name;
		this.email = email;
		this.selected = selected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
