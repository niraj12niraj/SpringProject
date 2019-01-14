/*package com.my.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="FBDATA")
@Entity
public class FbData {

	@Column(name="APP_ID")
	private String app_ID;
	@Column(name="APP_DOMIANS")
	private String app_Domains;
	@Column(name="CATEGORY")
	private String category;
	@Column(name="CLIENT_TOKEN")
	private String client_Token;
	@Column(name= "PRIVACY_POLICY_URL")
	private String privacy_Policy_URL;
	@Column(name="APP_SECRET")
	private String app_Secret;
	public FbData() {
		//default 
		System.out.println("default FbData Const..");
	}
	public FbData(String app_Id,String app_Domains,String client_Token,String privacy_policy_url,String app_secret) {
		this.app_ID=app_Id;
		this.app_Domains=app_Domains;
		//this.category=category;
		this.client_Token=client_Token;
		this.privacy_Policy_URL=privacy_policy_url;
		this.app_Secret=app_secret;
	}
	public String getApp_ID() {
		return app_ID;
	}
	public void setApp_ID(String app_ID) {
		this.app_ID = app_ID;
	}
	public String getApp_Domains() {
		return app_Domains;
	}
	public void setApp_Domains(String app_Domains) {
		this.app_Domains = app_Domains;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getClient_Token() {
		return client_Token;
	}
	public void setClient_Token(String client_Token) {
		this.client_Token = client_Token;
	}
	public String getPrivacy_Policy_URL() {
		return privacy_Policy_URL;
	}
	public void setPrivacy_Policy_URL(String privacy_Policy_URL) {
		this.privacy_Policy_URL = privacy_Policy_URL;
	}
	public String getApp_Secret() {
		return app_Secret;
	}
	public void setApp_Secret(String app_Secret) {
		this.app_Secret = app_Secret;
	}
	
}
*/