package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.entity.customer.Customer;
import com.study.service.customer.ICustomerService;



@Controller
public class TestController {
	@Value("emailPassword")
	private String emailPassword;
	@Autowired
	private ICustomerService customerService;
	@RequestMapping("toIndexPage")
	public String toIndexPage(Long id){
		System.out.println(emailPassword);
		Customer customer = customerService.getByPrimaryKey(id);
		System.out.println(customer.getId()+"==="+customer.getLoginName());
		return "/index";
	}
}
