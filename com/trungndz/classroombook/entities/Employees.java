package com.trungndz.classroombook.entities;
// Generated 12-Dec-2018 00:21:12 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "employees", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Employees implements java.io.Serializable {

	private int idemp;
	private String nameemp;
	private String email;
	private int idposition;

	public Employees() {
	}

	public Employees(int idemp, int idposition) {
		this.idemp = idemp;
		this.idposition = idposition;
	}

	public Employees(int idemp, String nameemp, String email, int idposition) {
		this.idemp = idemp;
		this.nameemp = nameemp;
		this.email = email;
		this.idposition = idposition;
	}

	@Id

	@Column(name = "idemp", unique = true, nullable = false)
	public int getIdemp() {
		return this.idemp;
	}

	public void setIdemp(int idemp) {
		this.idemp = idemp;
	}

	@Column(name = "nameemp", length = 50)
	public String getNameemp() {
		return this.nameemp;
	}

	public void setNameemp(String nameemp) {
		this.nameemp = nameemp;
	}

	@Column(name = "email", unique = true, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "idposition", nullable = false)
	public int getIdposition() {
		return this.idposition;
	}

	public void setIdposition(int idposition) {
		this.idposition = idposition;
	}

}
