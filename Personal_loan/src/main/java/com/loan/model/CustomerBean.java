package com.loan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerTable")
public class CustomerBean {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private static Integer customer_id;
	@Column
	private static String customer_name;
	@Column
	private static Long mobNumber;
	@Column
	private static String gender;
	public static Integer getCustomer_id() {
		return customer_id;
	}
	public static void setCustomer_id(Integer customer_id) {
		CustomerBean.customer_id = customer_id;
	}
	public static String getCustomer_name() {
		return customer_name;
	}
	public static void setCustomer_name(String customer_name) {
		CustomerBean.customer_name = customer_name;
	}
	public static Long getMobNumber() {
		return mobNumber;
	}
	public static void setMobNumber(Long i) {
		CustomerBean.mobNumber = i;
	}
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		CustomerBean.gender = gender;
	}
	public static String getDob() {
		return dob;
	}
	public static void setDob(String dob) {
		CustomerBean.dob = dob;
	}
	public static String getMarital_status() {
		return marital_status;
	}
	public static void setMarital_status(String marital_status) {
		CustomerBean.marital_status = marital_status;
	}
	public static Integer getCredit_score() {
		return credit_score;
	}
	public static void setCredit_score(Integer credit_score) {
		CustomerBean.credit_score = credit_score;
	}
	public static Integer getSalary() {
		return salary;
	}
	public static void setSalary(Integer salary) {
		CustomerBean.salary = salary;
	}
	public static Integer getExpense() {
		return expense;
	}
	public static void setExpense(Integer expense) {
		CustomerBean.expense = expense;
	}
	@Column
	private static String dob;
	@Column
	private static String marital_status;
	@Column
	private static Integer credit_score;
	@Column
	private static Integer salary;
	@Column
	private static Integer expense;
	

}
