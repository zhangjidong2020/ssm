package com.hxzy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//<bean name="" class="com.hxzy.springmvc.HelloControll"></bean>
public class HelloControll {
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView();
		System.out.println("hello");

		System.out.println("mike");
		System.out.println("mike123");

		System.out.println("tom");
		System.out.println("mike");

		//设置模型数据
		mv.addObject("msg","hello springmvc");
		//设置视图
		mv.setViewName("/WEB-INF/jsp/hello.jsp");
		return mv;
		
	}

}
