package com.bootapp.persist.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_users")
public class UserPO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "username", unique = true, length = 64)
	private String username; // 用户名

	@Column(name = "password", length = 64)
	private String password; // 密码

	private String avatar;  // 头像

	@Column(name = "name", length = 18)
	private String name;  // 昵称
	
	private int gender;   // 性别

	@Column(name = "email", unique = true, length = 128)
	private String email;  // 邮箱

	@Column(name = "mobile", length = 11)
	private String mobile;  // 手机号

	private Date created;  // 注册时间

	private int source; // 注册来源：主要用于区别第三方登录

	@Column(name = "last_login")
	private Date lastLogin;

	private String signature; // 个性签名

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
	private List<RolePO> roles = new ArrayList<RolePO>();

	@Column(name = "active_email")
	private int activeEmail; // 邮箱激活状态
	private int status; // 用户状态
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public List<RolePO> getRoles() {
		return roles;
	}
	public void setRoles(List<RolePO> roles) {
		this.roles = roles;
	}
	public int getActiveEmail() {
		return activeEmail;
	}
	public void setActiveEmail(int activeEmail) {
		this.activeEmail = activeEmail;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
