package com.humengyuan.bean;

public class Tb_brand {

	private int bid;
	private int sid;
	private String bname;
	private Tb_goodskind skind;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Tb_goodskind getSkind() {
		return skind;
	}

	public void setSkind(Tb_goodskind skind) {
		this.skind = skind;
	}

	@Override
	public String toString() {
		return "Tb_brand [bid=" + bid + ", sid=" + sid + ", bname=" + bname + ", skind=" + skind + "]";
	}

	public Tb_brand(int bid, int sid, String bname, Tb_goodskind skind) {
		super();
		this.bid = bid;
		this.sid = sid;
		this.bname = bname;
		this.skind = skind;
	}

	public Tb_brand() {
		super();
		// TODO Auto-generated constructor stub
	}

}
