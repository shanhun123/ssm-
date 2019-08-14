package com.neusoft.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.neusoft.bean.Emp;
import com.neusoft.mapper.EmpMapper;
import com.neusoft.mybatis.SqlSessionUtil;
import com.neusoft.service.EmpService;

@Service
public class EmpServiceBean implements EmpService {

	@Override
	public List<Emp> findAll() {
		System.out.println("...EmpServiceBean....findAll().....");
		List<Emp> list = null;
		SqlSession session = SqlSessionUtil.openSession();
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		try {
			list = mapper.findAll();
		} catch (SQLException e) {
			list=null;
			e.printStackTrace();
		}finally {
			session.close();
		}
		System.out.println("list.size="+list.size());
		return list;
	}

}
