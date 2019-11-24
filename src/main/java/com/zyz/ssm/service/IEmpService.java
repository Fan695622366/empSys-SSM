package com.zyz.ssm.service;

import java.util.List;

import com.zyz.ssm.pojo.Emp;

public interface IEmpService {

	/**
	 * 登录功能,根据用户名和密码登录
	 * @param username
	 * @param password
	 */
	Emp login(String name,String password);

	/**
	 * 登陆功能
	 * @param emp
	 */
	void register(Emp emp);

	/**
	 * 查看员工列表
	 * @return
	 */
	List<Emp> findAllEmp();

	
}
