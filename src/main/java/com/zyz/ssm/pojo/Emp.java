package com.zyz.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工的实体类
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Emp implements Serializable {

	/**
	 * 
	 */
	private Integer id;
	private String username;
	private String password;
	private String gender;
	private Integer age;
	private Date hiredate;
	private Double salary;
	private String phone;
	private String email;
	private String img;

	public Emp() {
	}

	public Emp(Integer id, String username, String password, String gender, Integer age, Date hiredate, Double salary,
			String phone, String email, String img) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.hiredate = hiredate;
		this.salary = salary;
		this.phone = phone;
		this.email = email;
		this.img = img;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender + ", age="
				+ age + ", hiredate=" + hiredate + ", salary=" + salary + ", phone=" + phone + ", email=" + email
				+ ", img=" + img + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}