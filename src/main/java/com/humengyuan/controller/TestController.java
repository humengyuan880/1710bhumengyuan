package com.humengyuan.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.humengyuan.bean.Tb_brand;
import com.humengyuan.bean.Tb_goods;
import com.humengyuan.bean.Tb_goodskind;
import com.humengyuan.service.GoodsService;

@Controller
public class TestController {

	@Autowired
	private GoodsService goodservice;

	/**
	 * 复选框2
	 */
	@RequestMapping("findskind")
	@ResponseBody
	public List<Tb_goodskind> xian2(Tb_goodskind skind) {
		List<Tb_goodskind> list = goodservice.xuan2();
		return list;
	}

	/**
	 * 复选框1
	 */
	@RequestMapping("findbrand")
	@ResponseBody
	public List<Tb_brand> xian1(Tb_brand brand) {
		List<Tb_brand> list = goodservice.xuan1();
		return list;
	}

	/**
	 * 添加
	 * 
	 * @throws IOException
	 */
	@RequestMapping("add")
	public String add(Tb_goods good, HttpServletRequest req, MultipartFile myFile) throws IOException {

		String realPath = req.getServletContext().getRealPath("upload");
		String filename = myFile.getOriginalFilename();
		File file = new File(realPath + "/" + filename);
		InputStream is = myFile.getInputStream();
		FileOutputStream os = new FileOutputStream(file);
		IOUtils.copy(is, os);
		os.flush();
		os.close();
		is.close();
		String img = "upload/" + filename;
		good.setImg(img);
		System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+img);

		int i = goodservice.addGoods(good);
		if (i > 0) {
			// 添加成功 跳list
			return "redirect:list.do";
		} else {
			return "add";
		}
	}

	/**
	 * 查询
	 * 
	 * @param good
	 * @param model
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("list")
	public String list(Tb_goods good, Model model, @RequestParam(defaultValue = "1") int pageNum) {
		Map<String, Object> map = new HashMap<String, Object>();
		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize);
		List<Tb_goods> list = goodservice.list(map);
		PageInfo<Tb_goods> pp = new PageInfo<Tb_goods>(list);
		model.addAttribute("pp", pp);
		return "list";
	}
	
	@RequestMapping("dels")
	@ResponseBody
	public    Boolean dels(String ids){
		Map<String, Object> map=new HashMap<String, Object>();
		String[] split = ids.split(",");
		map.put("ids", split);
		int i = goodservice.dels(map);
		if(i>0){
			return true;
		}
		return false;
	}
}
