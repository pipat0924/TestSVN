package com.pipat.it.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pipat.it.dao.HelloDao;
import com.pipat.it.model.HelloModel;

public class HelloDaoImp implements HelloDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public HelloModel getAll() throws SQLException {
		String sql = "SELECT * FROM STUDENT";
		HelloModel hello = null;
		Connection con = null;
		PreparedStatement p = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			p =con.prepareStatement(sql);
			rs =p.executeQuery();
			if(rs.next()){
				hello = new HelloModel(
						rs.getString("ID_ST"),
						rs.getString("NAME_ST"), 
						rs.getString("LAST_ST"),
						rs.getString("AGE_ST"));
			}else{
				System.out.println("Esle:");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
			p.close();
			rs.close();
		}
		
		
		return hello;
	}

}
