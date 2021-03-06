package com.bootapp.persist.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_auth_menu")
public class AuthMenuPO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String url;
	
	private int sort;
	
	private String permission;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="parent_id")
	private AuthMenuPO parent;
	
	@Column(name="parent_ids")
	private String parentIds;

	private String icon;

	@ManyToMany(mappedBy = "authMenus", fetch=FetchType.LAZY)
	private List<RolePO> roles = new ArrayList<RolePO>();
	
	@OneToMany(mappedBy = "parent", fetch=FetchType.LAZY)
	private List<AuthMenuPO> children = new ArrayList<AuthMenuPO>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public AuthMenuPO getParent() {
		return parent;
	}

	public void setParent(AuthMenuPO parent) {
		this.parent = parent;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<RolePO> getRoles() {
		return roles;
	}

	public void setRoles(List<RolePO> roles) {
		this.roles = roles;
	}

	public List<AuthMenuPO> getChildren() {
		return children;
	}

	public void setChildren(List<AuthMenuPO> children) {
		this.children = children;
	}
	
}
