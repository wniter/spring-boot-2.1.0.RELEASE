package com.example.demo.sample.mapper;

import com.example.demo.sample.entity.Emp;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;



/**
 * @create 2022-02-09 11:37
 */
@Mapper
@Repository
public interface EmpMapper {

	List<Emp> selectEmp();

	Emp selectEmpById(Integer empno);

	Integer addEmp(Emp emp);

	Integer updateEmp(Emp emp);

	Integer deleteEmp(Integer empno);
}
