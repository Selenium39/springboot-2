package com.wantao.springboot2.controller;/*
 *author:wantao
 *createTime:18-7-14 23:01
 *description:
 */

import com.wantao.springboot2.entity.User;
import com.wantao.springboot2.responsitory.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserResponsitory userResponsitory;

    //查询所有用户
    @GetMapping(value = "/users")
    @ResponseBody
    public List<User> findAllUser() {
        return userResponsitory.findAll();
    }

    //查询一个用户
    @GetMapping(value = "/user/{id}")
    @ResponseBody
    public User findUserById(@PathVariable("id") Integer id) {
        return userResponsitory.findById(id).orElse(null);
    }
    //通过年龄查询
    @GetMapping(value="/user/age/{age}")
    @ResponseBody
    public List<User> findUserByAge(@PathVariable("age") Integer age){
        return userResponsitory.findByAge(age);
    }


    //增加用户
    @PostMapping(value = "/user")
    @ResponseBody
    public User addUser(@Param("name") String name, @Param("age") Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return userResponsitory.save(user);
    }

    //修改用户
    @PutMapping(value = "/user/{id}")
    @ResponseBody
    public User updateUser(@PathVariable("id") Integer id, @Param("name") String name, @Param("age") Integer age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        return userResponsitory.save(user);//通过主键跟新
    }
    //删除用户
    @DeleteMapping(value = "/user/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable("id")Integer id){
        userResponsitory.deleteById(id);
        return "删除成功";
    }
}
