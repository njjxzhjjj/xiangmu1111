package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.LiuYan;
import com.hp.service.LiuYanService;

@Controller
@RequestMapping("/liuyan")
public class LiuYanController {
	@Autowired
	
	private LiuYanService liuYanService;
	@RequestMapping("/queryAll")
	public String queryAll(HttpSession session){
		ArrayList<LiuYan> liuyans=liuYanService.queryAll();
		session.setAttribute("liuyans",liuyans);
		return "main";

	}
	@RequestMapping("/addAll")
	public String add(LiuYan liuyan){
		int i=liuYanService.add(liuyan);
		if(i>0){
			System.out.println("添加成功");
			return "redirect:/liuyan/queryAll";
		}else{
		
			System.out.println("添加失败");
			return "index";
		}

	}
}
