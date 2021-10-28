package DTO;

public class login {
	private String ID;
	private String PW;
	
	public login(String ID, String PW) {
		this.ID=ID;
		this.PW=PW;
	}
 	
	public String getID() {
		return this.ID;
	}
	
	public String getPW() {
		return this.PW;
	}
}
