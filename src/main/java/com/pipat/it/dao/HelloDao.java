package com.pipat.it.dao;

import java.sql.SQLException;

import com.pipat.it.model.HelloModel;

public interface HelloDao {
	public HelloModel getAll() throws SQLException;
}
