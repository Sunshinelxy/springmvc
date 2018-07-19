package cn.sunshine.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.sunshine.pojo.Items;

public class ItemsController1 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		request.setAttribute("items", list);
		request.getRequestDispatcher("jsp/itemsList.jsp").forward(request, response);

	}

}
