package com.pipat.it.util;


import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class JDBCService {
	private static JdbcTemplate jdbcTemplate;
	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring-datasource.xml");
	final static Logger logger = Logger.getLogger(JDBCService.class);
	public static JdbcTemplate getJdbcTemplate() {
		
		return jdbcTemplate;
	}
	public static void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JDBCService.jdbcTemplate = jdbcTemplate;
	}
	
	public void setDataSource(DataSource dataSource) {
		JDBCService.setJdbcTemplate(new JdbcTemplate(dataSource));
	}
	public static JDBCService getInstance() {
		JDBCService jdbcService = (JDBCService) context.getBean("modelTemplate");
		logger.info("Connect Database Success");
		return jdbcService;
	}
}
