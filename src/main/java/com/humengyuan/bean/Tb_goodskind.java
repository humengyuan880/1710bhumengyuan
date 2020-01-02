package com.humengyuan.bean;

public class Tb_goodskind {

	private int sid;
	private String sname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Tb_goodskind [sid=" + sid + ", sname=" + sname + "]";
	}

	public Tb_goodskind(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Tb_goodskind() {
		super();
		// TODO Auto-generated constructor stub
	}

}
