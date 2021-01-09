package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
        public List<User> getUserList(){
        return userService.selectAll();
    }

    /***
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        userService.insert(user);
        return "success";
    }

    /***
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")int id) {

        return userService.selectOne(id);
    }
    /**
     * 更新指定id用户信息
     * @param
     * @param user
     * @return
     */
    @PutMapping("/user")
    public String updateUser(@RequestBody User user) {
        userService.update(user);
        return "修改成功";
    }
    /***
     * 删除指定id用户
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") int id) {

        userService.delete(id);
        return "success";

    }
}
