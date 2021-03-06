package com.bootapp.base.vo;

import java.util.ArrayList;
import java.util.List;

import com.bootapp.persist.entity.AuthMenuPO;

public class RoleVO {
	private long id;

	private String name;

	private List<AuthMenuPO> authMenus = new ArrayList<AuthMenuPO>();

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

	public List<AuthMenuPO> getAuthMenus() {
		return authMenus;
	}

	public void setAuthMenus(List<AuthMenuPO> authMenus) {
		this.authMenus = authMenus;
	}
	
}
