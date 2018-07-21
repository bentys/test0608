package com.example.demo;

import eg.Students;
import org.apache.catalina.connector.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.kopitubruk.util.json.JSONUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.server.Http2;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.PropertySource;
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
@ConfigurationProperties(prefix = "my1")

public class Controller {

	private int x=1;
    private int y=1;
    private int z=0;
    private int p=0;
	private Log logger = LogFactory.getLog(Controller.class);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Log getLogger() {
        return logger;
    }

    public void setLogger(Log logger) {
        this.logger = logger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (String)name;
    }

    private int age;
    private String name;
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
        //通过"https://docs.oracle.com/javaee/6/api/javax/servlet/http/Cookie.html"中来引入一个Cookies的包
        Cookie s1=new Cookie("loc1","222q");
        //Cookie s2=new Cookie("loc2","222w");
        //Cookie s3=new Cookie("loc3","222s");
       // Cookie[] a1=new Cookie[]{s1,s2,s3};
        response.addCookie(s1);
        //response.addCookie(s2);

        //response.addCookie(s3);

        return  p+"次!!!"+"---";

}
    @RequestMapping(value = "/getClass1",method = RequestMethod.GET)
    //http://localhost:8082/getClass1?s1=2&s2=2  响应的查询穿参数操作
        public @ResponseBody  String pattem(@RequestParam("s1") int s1,@RequestParam("s2") int s2){

        Map<Integer,String>  item=new HashMap<Integer, String>() ;

        item.put(1,"苹果1");
        item.put(2,"苹果2");
        item.put(3,"苹果3");
        item.put(4,"苹果4");
        item.put(5,"苹果5");
        item.put(6,"苹果6");
        item.put(7,"苹果7");
        item.put(8,"苹果8");


        String s3=item.get(s1) ;

        System.out.print(s3);
        return s3;
    }






    @RequestMapping(value = "/getClass2/{s1}/{s2}",method = RequestMethod.GET)
    //http://localhost:8082/getClass2/2/2





        public @ResponseBody  Object pattem2(@PathVariable("s2") int s1,@PathVariable("s2") int s2){

        Map<Integer,String>  item=new HashMap<Integer, String>() ;

        item.put(1,"苹果1");
        item.put(2,"苹果2");
        item.put(3,"苹果3");
        item.put(4,"苹果4");
        item.put(5,"苹果5");
        item.put(6,"苹果6");
        item.put(7,"苹果7");
        item.put(8,"苹果8");


        String s3=item.get(s1) ;
          p++;
        System.out.print(s3);
        logger.info("xxxxxxxx"+p+"次");

        return s3+"---"+p+"次"+"\n \n http://localhost:8082/getClass2/{s1}/{s2}"+"arg::"+age+",name::"+name;
    }
}