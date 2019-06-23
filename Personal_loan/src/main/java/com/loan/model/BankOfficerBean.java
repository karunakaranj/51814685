package com.loan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bankofficer")
public class BankOfficerBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private static Integer id;
	@Column
	private static String name;
	@Column
	private static String level;
	public static Integer getId() {
		return id;
	}
	public static void setId(Integer id) {
		BankOfficerBean.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		BankOfficerBean.name = name;
	}
	public static String getLevel() {
		return level;
	}
	public static void setLevel(String level) {
		BankOfficerBean.level = level;
	}
	

}
