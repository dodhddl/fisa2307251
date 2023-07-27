package com.fisa.model.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Entity (name = "fisadept07")
public class DeptCopy {
	@Id
	private int deptno;
	private String dname;
	private String loc;
}
