package com.zyz.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyz.ssm.mapper.EmpMapper;
import com.zyz.ssm.pojo.Emp;
import com.zyz.ssm.service.IEmpService;

/**
 * IEmpService接口的实现类
 */
@Service
public class EmpService implements IEmpService {

	@Resource
	private EmpMapper empMapper;

	@Override
	public Emp login(String username, String password) {
		return empMapper.findEmpByNameAndPassword(username, password);
	}

	@Override
	public void register(Emp emp) {
		empMapper.register(emp);
	}

	@Override
	public List<Emp> findAllEmp() {
		return empMapper.findAllEmp();
	}

}
