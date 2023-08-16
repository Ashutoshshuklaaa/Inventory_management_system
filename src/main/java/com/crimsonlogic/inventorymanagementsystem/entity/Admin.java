package com.crimsonlogic.inventorymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "admin_info")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	
	@Pattern(regexp = "^[a-zA-Z]+$")
	private String adminName;
	
	
	private String adminEmail;
	
	
	//@Pattern(regexp = "^[0-9]{0,10}")
	private String userName;
	
	private String adminPassword;

	public Admin() {
		super();
	}

	public Admin(Integer adminId, @Pattern(regexp = "^[a-zA-Z]+$") String adminName, String adminEmail, String userName,
			String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.userName = userName;
		this.adminPassword = adminPassword;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail + ", userName="
				+ userName + ", adminPassword=" + adminPassword + "]";
	}
	
	
}
