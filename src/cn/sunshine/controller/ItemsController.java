package cn.sunshine.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.sunshine.pojo.Items;

public class ItemsController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Items> list = new ArrayList<Items>();
		Items items1 = new Items();
		items1.setName("荣耀8");
		items1.setCreatetime(new Date());
		items1.setDetail("挺好用的");
		items1.setPrice(1999f);
		
		Items items2 = new Items();
		items2.setName("联想电脑");
		items2.setCreatetime(new Date());
		items2.setDetail("挺好用的");
		items2.setPrice(5999f);
		list.add(items1);
		list.add(items2);
		ModelAndView mav = new ModelAndView();
		mav.addObject("items",list);
		mav.setViewName("jsp/itemsList.jsp");
		return mav;
	}

}
