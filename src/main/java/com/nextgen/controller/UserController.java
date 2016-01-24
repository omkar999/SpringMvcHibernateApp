package com.nextgen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	// @ResponseBody
	@RequestMapping("/greet")
	public ModelAndView greetUser() {
		List values = new ArrayList();

		Price p1 = new Price();
		p1.setValue(99);
		Price p2 = new Price();
		p2.setValue(11.11);
		List pList = new ArrayList();
		pList.add(p1);
		pList.add(p2);

		List products = new ArrayList();
		Product product = new Product();
		Product product1 = new Product();
		product1.setPrices(pList);
		products.add(product);
		products.add(product1);

		product.setPrices(pList);
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("products", products);
		return mav;
	}

}
