package com.bootapp.persist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.bootapp.persist.dao.RoleDao;
import com.bootapp.persist.entity.RolePO;

@Repository
public class RoleDaoImpl implements RoleDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<RolePO> queryAll() {
		String sql = "from RolePO";
		TypedQuery<RolePO> query = em.createQuery(sql, RolePO.class);
		return query.getResultList();
	}
	
}
