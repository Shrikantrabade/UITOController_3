package UITOController.controller.Model;

public class User {

	
	private String fName;
	private String lname;
	private String email;
	private String uname;
	private String password;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [fName=" + fName + ", lname=" + lname + ", email=" + email + ", uname=" + uname + ", password="
				+ password + "]";
	}
	
	
	
}
