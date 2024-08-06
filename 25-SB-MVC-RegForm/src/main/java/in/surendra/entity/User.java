package in.surendra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userMail;
	private String userPwd;
	private Integer userPhnno;
	public Integer getuserId() {
		return userId;
	}
	public void setuserId(Integer userId) {
		this.userId = userId;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getuserMail() {
		return userMail;
	}
	public void setuserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getuserPwd() {
		return userPwd;
	}
	public void setuserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getuserPhnno() {
		return userPhnno;
	}
	public void setuserPhnno(Integer userPhnno) {
		this.userPhnno = userPhnno;
	}
	
	

}
