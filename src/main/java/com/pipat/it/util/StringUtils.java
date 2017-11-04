package com.pipat.it.util;

public class StringUtils {
	public static String convertDBNullValue(String text){
    	if (text == null || text.equals("") || text.equals("null")) {
			return "";
		}
    	return text;
    }
}
