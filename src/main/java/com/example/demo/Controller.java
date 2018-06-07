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

import static android.R.attr.name;
import static android.R.attr.publicKey;

@RestController

public class Controller {

	private int x=1;
    private int y=1;
    private int z=0;
    private int p=0;
	@RequestMapping(value = "users",method = RequestMethod.GET)
	public @ResponseBody Object users(){
		List<String> userList=new ArrayList<>();
		userList.add("tom");
		userList.add("marry");
		userList.add("jack");



		System.out.println("get....."+x);
		x++;

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
		System.out.println("put....."+y);
			y++;
			return map;

		}


	@RequestMapping(value = "name",method = RequestMethod.GET)
	public @ResponseBody String Say(String name,String age){

		z++;
		System.out.println("get——admin....."+z);
		return "This is get,is "+name+" ++"+age+"!!"+z+"次!!!";
	}


	@RequestMapping(value = "style",method = RequestMethod.GET)
	public @ResponseBody String stlye(){
		p++;
		String style="<html><head> Style 样式</head> <body><h1 >helloword</h1><p>这段文字的字体颜色为绿色</p></body></html> ";
		return style +p+"次!!!";
	}

	}





