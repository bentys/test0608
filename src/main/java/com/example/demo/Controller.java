package com.example.demo;

import eg.Students;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


	@RequestMapping(value ="login2", method = RequestMethod.POST)

	public @ResponseBody Object login2(@RequestParam  String name, String pwd){

		Map<String,Object> map=new HashMap<>();


		if ("123".equals(pwd)&&"jack".equals(name)){
			map.put("status","正确name:"+name+"pwd:"+pwd);
		}else{

			map.put("status","失败name:"+name+"pwd:"+pwd);
		}
		System.out.println("put....."+y);
		y++;
		return map;

	}



	@RequestMapping(value ="/pathjson", method = RequestMethod.POST)
//修改想要的注释内容,需要传递什么的json格式内容,通过json格式内容最终,通过json返回。
		public @ResponseBody
	Object pathjson(@RequestBody Students s){ //其中"s" 表示行参,其中?可以接受相应的实体。。

			Students s1=new Students();

			s1.userAge=s.userAge;
		    s1.userName=s.userName;


			Map<Integer,String> map1=new HashMap<>();
			map1.put(s1.getUserAge(),s1.getUserName());
			map1.put(y,s1.getUserName()+y);

			y++;
			return map1;







	}


}





