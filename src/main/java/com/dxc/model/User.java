package com.dxc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tab")
public class User {
	@Id
	@Column(name = "acc_num_col")
	@GeneratedValue(generator = "User")
	private Integer accNum;
	@Column(name = "first_name_col")
	private String firstName;
	@Column(name = "last_name_col")
	private String lastName;
	@Column(name = "mob_num_col")
	private Long mobNum;
	@Column(name = "email_col")
	private String email;
	@Column(name = "password_col")
	private String password;
	@Column(name = "time_stamp_col")
	private Date createdTime;
	
	public User(String firstName, String lastName, String email, String password, Long mobNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobNum = mobNum;
	}
	public User() {
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
	public Long getMobNum() {
		return mobNum;
	}
	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Integer getAccNum() {
		return accNum;
	}
	@Override
	public String toString() {
		return "User [accNum=" + accNum + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", mobNum=" + mobNum + ", createdTime=" + createdTime + "]";
	}
	
		

}
