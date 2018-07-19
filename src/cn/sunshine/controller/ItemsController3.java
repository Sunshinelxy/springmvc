package cn.sunshine.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.sunshine.pojo.Items;

@Controller
public class ItemsController3 {
	@RequestMapping("/getItems")
	public ModelAndView getItemsList() {
		List<Items> list = new ArrayList<Items>();
		// 创建商品对象
		Items items = new Items();
		items.setName("荣耀8");
		items.setCreatetime(new Date());
		items.setDetail("挺好用的");
		items.setPrice(1999f);
		
		Items items1 = new Items();
		items1.setName("联想电脑");
		items1.setCreatetime(new Date());
		items1.setDetail("挺好用的");
		items1.setPrice(5999f);
		list.add(items);
		list.add(items1);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("items",list);
		mv.setViewName("jsp/itemsList.jsp");
		return mv;
	}
}
