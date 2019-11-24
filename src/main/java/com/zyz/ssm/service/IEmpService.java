package com.zyz.ssm.service;

import com.zyz.ssm.pojo.Emp;

public interface IEmpService {

	/**
	 * 登录功能,根据用户名和密码登录
	 * @param username
	 * @param password
	 */
	Emp login(String name,String password);

	void register(Emp emp);
	
}
