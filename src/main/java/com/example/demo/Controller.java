package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *
 * 这是一个SpringBOOT的应用用于主要的操作。
 * */

@RestController

public class Controller {
	int x,y,z;

	@RequestMapping(value = "users",method = RequestMethod.GET)
	public @ResponseBody Object users(){
		List<String> userList=new ArrayList<>();
		userList.add("tom");
		userList.add("marry");
		userList.add("jack");
		return userList;
	}


	@RequestMapping(value ="login", method = RequestMethod.POST)

		public @ResponseBody Object login(String name,String pwd){

			Map<String,Object> map=new HashMap<>();

			if ("123".equals(pwd)&&"jack".equals(name)){
				map.put("status",0);
			}else{

				map.put("status",-1);
			}

			return map;

		}


		@RequestMapping(value ="admin", method = RequestMethod.GET)
		public @ResponseBody Object t1 (){
			z++;
			this.z=z;
		String	z1= String.valueOf(z)+"次数请求";
			List<String> userList=new ArrayList<>();
			userList.add("tom");
			userList.add("marry");
			userList.add("jack");
			userList.add(z1);
			return userList;




		}


	}





