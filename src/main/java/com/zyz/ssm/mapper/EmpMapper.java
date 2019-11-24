package com.zyz.ssm.mapper;

import org.apache.ibatis.annotations.Param;

import com.zyz.ssm.pojo.Emp;

/**
 * emp对象的dao接口
 */
public interface EmpMapper {

	/**
	 * 登陆功能
	 */
	Emp findEmpByNameAndPassword(@Param("username")String username, @Param("password")String password);

	/**
	 * 注册功能
	 * @param emp
	 */
	void register(Emp emp);

}
