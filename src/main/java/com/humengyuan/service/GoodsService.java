package com.humengyuan.service;

import java.util.List;
import java.util.Map;

import com.humengyuan.bean.Tb_brand;
import com.humengyuan.bean.Tb_goods;
import com.humengyuan.bean.Tb_goodskind;

public interface GoodsService {
	// 查询所有
	public List<Tb_goods> list(Map<String, Object> map);

	// 添加
	public int addGoods(Tb_goods good);

	// 复选框一
	public List<Tb_brand> xuan1();

	public List<Tb_goodskind> xuan2();
	
	public   int   dels(Map<String,Object> map);
}
