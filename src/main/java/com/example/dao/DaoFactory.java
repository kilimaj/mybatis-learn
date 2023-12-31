package com.example.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class DaoFactory {

	private DaoFactory() {

	}

	public static CustomerDao getCustomerDao() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		// The true parameter indicates to automatically commit and close session to save data in db
		SqlSession session = factory.openSession(true);
		
		return session.getMapper(CustomerDao.class);
	}
}
