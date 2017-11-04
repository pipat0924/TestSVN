package com.pipat.it.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pipat.it.dao.HelloDao;
import com.pipat.it.model.HelloModel;
import com.pipat.it.util.JDBCService;
import com.pipat.it.util.SqlUtils;

import net.sf.json.JSONArray;
public class MainAction {
	final static Logger logger = Logger.getLogger(MainAction.class);
	
	public static void main(String[] args) throws SQLException {
		
		SqlUtils m = new SqlUtils();
		JDBCService jdbc = new JDBCService();
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-datasource.xml");
//		HelloDao helldao = (HelloDao) context.getBean("modelTemplate");
//		HelloDao helldao = (HelloDao) jdbc.getInstance();

		String sql = String.valueOf(m.readSQLfile(null,"SelectAll"));
		List<Map<String,Object>> list = null;
		list = JDBCService.getInstance().getJdbcTemplate().queryForList(sql);
//		System.out.println("total===:::"+list.get(0).get("NAME_ST").toString());
		logger.info("total===:::"+list.get(0).get("NAME_ST").toString());
		logger.error("total===:::"+list.get(0).get("NAME_ST").toString());
//		try{
//		if(!list.isEmpty()){
//			System.out.println("d888");
//        	data = JSONArray.fromObject(list).toString();
//        	
//        }
//		}catch(Exception e){
//			e.printStackTrace();
//			
//		}

	}

}
