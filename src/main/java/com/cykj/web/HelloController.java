package com.cykj.web;

import com.cykj.bean.User;
import com.cykj.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin")
public class HelloController {

    @Autowired
    private UserServiceImpl userService;

    //    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {

        return "hello";
    }

    @ResponseBody
    @PostMapping("getHello4")
    public String getHello4(String username,String password){
        System.out.println(username);
        System.out.println(password);

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        List<User> list = userService.findUser(user);
        if (list.size() > 0){
            return "1111";
        }
        return "no";
    }

}
