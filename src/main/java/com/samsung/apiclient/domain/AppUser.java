package com.samsung.apiclient.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.samsung.apiclient.enumtype.Provider;

@Entity
@Table(name = "user")
public class AppUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Provider provider;
	
	@Column
	private String userName;
	
	@Column
	private String passWord;
	
	@Column
	private Boolean enable;
	
	public AppUser() {
		// TODO Auto-generated constructor stub
	}

	public AppUser(Provider provider, String userName, String passWord, Boolean enable) {
		super();
		this.provider = provider;
		this.userName = userName;
		this.passWord = passWord;
		this.enable = true;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
