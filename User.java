package com.my.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="USERA")
public class User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8115471962373078345L;
	@Id
	@SequenceGenerator(initialValue=1, name = "seqI")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	@Column(name="NAME")
	private String name;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="MOBILE")
	private Long mobile;
	@Column(name="EMAIL",unique=true)
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="ROLE")
	private String role;
	
	public User(Long id,String name,String add,Long mobile,String email, String pass,String role){
		this.id=id;
		this.name=name;
		this.address=add;
		this.mobile=mobile;
		this.email=email;
		this.password=pass;
		this.role=role;
	}
	
	
	public User() {
		System.out.println("default User Constructor");
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	public String toString() {
		return "Id--"+id+", Name--"+name+", Mobile--"+ mobile+", Role--"+role+", Address--"+address+", Email--"+email+", Passsword--"+"*****";
	}

}
