package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xct15990138050 on 18/7/8.
 */
@RestController
@RequestMapping
public class UserConntriller {
    @GetMapping("/index")
    public  ModelAndView   MoldAndView(){

        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        // 设置属性
        view.addObject("title", "我的第一个WEB页面");
        view.addObject("desc", "欢迎进入Luis-web 系统");
        Author author = new Author();
        author.setAge(24);
        author.setEmail("1085143002@qq.com");
        author.setName("Luis");
        view.addObject("author", author);
        return view;
    }


    class Author {
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        private String name;
        private String email;

    }



}



