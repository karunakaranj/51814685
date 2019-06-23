package com.loan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoanTable")
public class LoanBean {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private static Integer account_number;
@Column
private static Integer loan_status;
@Column
private static Integer amount;
@Column
private static Integer manager_id;
public static Integer getAccount_number() {
	return account_number;
}
public static void setAccount_number(Integer account_number) {
	LoanBean.account_number = account_number;
}
public static Integer getLoan_status() {
	return loan_status;
}
public static void setLoan_status(Integer loan_status) {
	LoanBean.loan_status = loan_status;
}
public static Integer getAmount() {
	return amount;
}
public static void setAmount(Integer amount) {
	LoanBean.amount = amount;
}
public static Integer getManager_id() {
	return manager_id;
}
public static void setManager_id(Integer manager_id) {
	LoanBean.manager_id = manager_id;
}

	
}
