package com.pipat.it.util;

import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

import com.pipat.it.controller.MainAction;

public class SqlUtils {
	final static Logger logger = Logger.getLogger(SqlUtils.class);
	public StringBuffer readSQLfile(String pathname ,String sqlname){
		StringBuffer datasql = new StringBuffer();
		InputStream is = null ;
		try{
			if(pathname != null && pathname != ""){
				is = MainAction.class.getResource("/com/pipat/it/sql/"+pathname+"/"+sqlname+".sql").openStream();
				logger.info("Not isEmpty pathname sql");
			}else{
				is = MainAction.class.getResource("/com/pipat/it/sql/"+sqlname+".sql").openStream();
				logger.info("IsEmpty pathname sql");
				
			}
			InputStreamReader reader = new InputStreamReader(is);
			char[] charbuffer = new char[1024];
			int forint = -1;

			while ((forint = reader.read(charbuffer)) >0) {
				
				datasql.append(charbuffer, 0, forint);
			}
		}catch(Exception e){
			logger.error("readFile", e);
			e.printStackTrace();
		}
		return datasql;
	}
}
