package com.pipat.it.model;

public class HelloModel {

	String id_st;
	String name_st;
	String last_st;
	String age_st;

	public String getId_st() {
		return id_st;
	}

	public void setId_st(String id_st) {
		this.id_st = id_st;
	}

	public String getName_st() {
		return name_st;
	}

	public void setName_st(String name_st) {
		this.name_st = name_st;
	}

	public String getLast_st() {
		return last_st;
	}

	public void setLast_st(String last_st) {
		this.last_st = last_st;
	}

	public String getAge_st() {
		return age_st;
	}

	public void setAge_st(String age_st) {
		this.age_st = age_st;
	}

	public HelloModel(String id_st, String name_st, String last_st, String age_st) {
		this.id_st = id_st;
		this.name_st = name_st;
		this.last_st = last_st;
		this.age_st = age_st;
	}

	@Override
	public String toString() {
		return "HelloModel [id_st=" + id_st + ", name_st=" + name_st + ", last_st=" + last_st + ", age_st=" + age_st
				+ "]";
	}
	
	
}
