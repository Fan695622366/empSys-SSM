package com.zyz.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zyz.ssm.pojo.Emp;
import com.zyz.ssm.service.IEmpService;

@Controller
@RequestMapping(value="/empAction")
public class EmpAction {
	
	/**
	 * 贴上@Resource标签,通过ioc去拿IEmpService接口的子实现类对象
	 */
	@Resource
	private IEmpService empService;
	
	/**
	 * 给方法贴上@RequestMapping标签,交给springMVC来处理<br>
	 * 请求的方式只能是POST,如果是GET或者其他的请求方式,则会报400的异常(畸形的请求语法)
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ModelAndView EmpLogin(String username,String password) {
		
		/**
		 * 注册功能,返回的是Emp对象<br>
		 * 我们可以判断这个对象是否为null,就能判定用户帐号密码是否正确
		 */
		Emp emp = empService.login(username, password);
		
		//创建ModelAndView对象
		ModelAndView mad = new ModelAndView();		
		
		//emp为null,代表用户的帐号密码错误
		if(emp == null) {
			mad.setViewName("login");
			mad.addObject("empMsg", "帐号或密码不正确哦.");
			return mad;
		}
		
		//将emp存入mad中,以便前台取值
		mad.addObject("emp",emp);
		//emp不为null时,让其跳转至success.jsp页面
		mad.setViewName("success");
		return mad;
	}
	
	/**
	 * 注册功能
	 */
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public ModelAndView EmpRegister(Emp emp) {
		
		empService.register(emp);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		return mav;
		
	}
	
	@RequestMapping(value="/findAllEmp")
	public ModelAndView findAllEmp() {
		
		ModelAndView mav = new ModelAndView();
		
		List<Emp> empList = empService.findAllEmp();
		
		mav.addObject("empList", empList);
		mav.setViewName("/empList");
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
