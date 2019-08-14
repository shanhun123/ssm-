package com.neusoft.mapper;

import java.sql.SQLException;
import java.util.List;

import com.neusoft.bean.Emp;

public interface EmpMapper {
	public List<Emp> findAll() throws SQLException;
}
