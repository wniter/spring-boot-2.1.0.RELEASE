package com.example.demo.sample.entity;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Objects;

/**
 * @create 2022-02-09 11:33
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;

	public Emp(int i, String heheda) {
		this.empno =i;
		this.ename = heheda;
	}

	@Override
	public String toString() {
		return "Emp{" +
				"empno=" + empno +
				", ename='" + ename + '\'' +
				", job='" + job + '\'' +
				", mgr=" + mgr +
				", hiredate=" + hiredate +
				", sal=" + sal +
				", comm=" + comm +
				", deptno=" + deptno +
				'}';
	}
	@Override
	public int hashCode() {

		return Objects.hash(empno, ename, job, mgr, hiredate, sal, comm, deptno);
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Emp)) return false;
		Emp emp = (Emp) o;
		return Objects.equals(empno, emp.empno) &&
				Objects.equals(ename, emp.ename) &&
				Objects.equals(job, emp.job) &&
				Objects.equals(mgr, emp.mgr) &&
				Objects.equals(hiredate, emp.hiredate) &&
				Objects.equals(sal, emp.sal) &&
				Objects.equals(comm, emp.comm) &&
				Objects.equals(deptno, emp.deptno);
	}
}
