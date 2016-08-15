package com.bootapp.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bootapp.BootApplication;
import com.bootapp.base.vo.RoleVO;
import com.bootapp.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(BootApplication.class)
public class RoleServiceImplTest {

	@Autowired
	RoleService service;
	
	@Test
	public void test() {
		List<RoleVO> list = service.queryAll();
		String res = ToStringBuilder.reflectionToString(list, ToStringStyle.SHORT_PREFIX_STYLE);
		System.out.println(res);
	}

}
