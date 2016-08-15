package com.bootapp.service.impl;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootapp.base.vo.RoleVO;
import com.bootapp.persist.dao.RoleDao;
import com.bootapp.persist.entity.RolePO;
import com.bootapp.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDao dao;

	@Override
	public List<RoleVO> queryAll() {
		List<RoleVO> list = Collections.emptyList();
		
		List<RolePO> pos = dao.queryAll();
		for (RolePO po : pos) {
			RoleVO vo = new RoleVO();
			BeanUtils.copyProperties(po, vo);
			list.add(vo);
		}
		return list;
	}

}
