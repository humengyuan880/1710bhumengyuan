package com.humengyuan.bean;

public class Tb_goods {
	private int gid;
	private String gname;
	private int size;
	private int price;
	private int count;
	private String biaoq;
	private String img;
	private int bid;
	private Tb_brand brand;
    private int  xx;
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getBiaoq() {
		return biaoq;
	}

	public void setBiaoq(String biaoq) {
		this.biaoq = biaoq;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Tb_brand getBrand() {
		return brand;
	}

	public void setBrand(Tb_brand brand) {
		this.brand = brand;
	}

	



	public Tb_goods(int gid, String gname, int size, int price, int count, String biaoq, String img, int bid,
			Tb_brand brand, int xx) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.size = size;
		this.price = price;
		this.count = count;
		this.biaoq = biaoq;
		this.img = img;
		this.bid = bid;
		this.brand = brand;
		this.xx = xx;
	}

	public int getXx() {
		return xx;
	}

	public void setXx(int xx) {
		this.xx = xx;
	}

	public Tb_goods() {
		super();
		// TODO Auto-generated constructor stub
	}

}
