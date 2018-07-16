package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping(value ="/login2", method = RequestMethod.POST)

	public @ResponseBody Object login2(@RequestBody String name1, String pwd1){

		String[] xinxi=new String[2];
		xinxi[0]=name1;
		xinxi[1]=pwd1;

		Map<String ,Object> s1=new HashMap<>();
		s1.put("11",name1);
		s1.put("22",pwd1);
		s1.put("xaa","xxx");
		s1.put("x",xinxi[2]);

		Object g1=s1.get("xaa");


		//return g1;
		return s1;
	}


	}





