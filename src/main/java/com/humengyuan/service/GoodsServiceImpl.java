package com.humengyuan.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humengyuan.bean.Tb_brand;
import com.humengyuan.bean.Tb_goods;
import com.humengyuan.bean.Tb_goodskind;
import com.humengyuan.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper amapper;

	public List<Tb_goods> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return amapper.list(map);
	}

	public int addGoods(Tb_goods good) {
		// TODO Auto-generated method stub
		return amapper.addGoods(good);
	}

	public List<Tb_brand> xuan1() {
		// TODO Auto-generated method stub
		return amapper.xuan1();
	}

	public List<Tb_goodskind> xuan2() {
		// TODO Auto-generated method stub
		return amapper.xuan2();
	}

	public int dels(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return amapper.dels(map);
	}

}
