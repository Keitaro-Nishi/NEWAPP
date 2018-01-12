package com.example;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the chatbot database table.
 * aaa
 */
@Entity
@Table(name="custinfo")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;
	@Column
	private String custid;
	@Column
	private String custname;
	@Column
	private String orgname;
	@Column
	private String password;
	@Column
	private String effect;
	@Column
	private String role;
	
	
	public User() {
	}
	
	public User(Integer no,String custid,String custname,String orgname,String password,String effect,String role) {
		this.no = no; 
		this.custid = custid;
        this.custname = custname;
        this.orgname = orgname;
        this.password = password;
        this.effect = effect;
        this.role = role;
    }

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public String getOrgname() {
		return this.orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}


}
