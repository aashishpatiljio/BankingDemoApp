package com.dxc.dto;

public class UserDTO {
	
	private String firstName;
	private String lastName;
	private Long mobNum;
	private String email;
	private String password;
	public UserDTO(String firstName, String lastName, Long mobNum, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNum = mobNum;
		this.email = email;
		this.password = password;
	}
	public UserDTO() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getMobNum() {
		return mobNum;
	}
	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [firstName=" + firstName + ", lastName=" + lastName + ", mobNum=" + mobNum + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
	

}
