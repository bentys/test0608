package com.example.demo;

import eg.Students;
import org.apache.catalina.connector.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.kopitubruk.util.json.JSONUtil;
import org.springframework.boot.web.server.Http2;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
	private Log logger = LogFactory.getLog(Controller.class);
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


	@RequestMapping(value = "admin",method = RequestMethod.GET)
	public @ResponseBody String Say(){
		z++;
		System.out.println("get——admin....."+z);
		return "This is get,is admin Pages"+z+"次!!!";
	}


	@RequestMapping(value = "style",method = RequestMethod.GET)
	public @ResponseBody String stlye(){
		p++;
		String style="<html><head> Style 样式</head> <body><h1 >helloword</h1><p>这段文字的字体颜色为绿色</p></body></html> ";
		return style +p+"次!!!";
	}


	@RequestMapping(value = "style2",method = RequestMethod.GET)

        public @ResponseBody String pattam1(){
        p++;
        String style="<html><head> Style2 样式</head> <body><h1 >helloword</h1><p>这段文字的字体颜色为绿色2</p></body></html> ";

        return style +p+"次!!!";

    }


    @RequestMapping(value = "/style3",method = RequestMethod.GET)

        public @ResponseBody String patta2(HttpServletResponse response){
        p++;
        String style="<html><head> Style3 样式</head> <body><h1 >helloword3</h1><p>这段文字的字体颜色为绿色2</p></body></html> ";
        //通过
        Cookie s1=new Cookie("loc","222");
        response.addCookie(s1);

        return style +p+"次!!!";

    }

	}





