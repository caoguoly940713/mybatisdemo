package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.Response;
import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @GetMapping(path = "getAllUsers")
    public Response getAllUsers(HttpSession session) {
        Response response = new Response();
        response.setSuccess(false);
        if(checkLogin(session)){
            response.setMessage("登录失效或者未登录");
        }else {
            response.setSuccess(true);
            response.setData(userMapper.listUsers());
        }
        return response;
    }

    @GetMapping(path = "deleteUser")
    public Response deleteUser(String userName, HttpSession session) {
        Response response = new Response();
        response.setSuccess(false);
        if(checkLogin(session)){
            response.setMessage("登录失效或者未登录");
        }else {
            response.setSuccess(true);
            userMapper.deleteUserForName(userName);
        }
        return response;
    }

    private boolean checkLogin(HttpSession session){
        User user = (User) session.getAttribute("user");
        System.out.println("当前用户："+ user);
        return (user == null);
    }
}
