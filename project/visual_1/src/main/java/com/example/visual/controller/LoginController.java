package com.example.visual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping(value = "/rabies/login")
    @ResponseBody
    // 对登录请求判断request的参数值，并存放在map中
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        System.out.println("收到来自前台的：" + username + ", " + password);
        if (username != null && password != null && "admin".equals(username) && "rabies2021".equals(password)) {
            // 登录成功，就跳转到下一个页面
            //在session设置用户信息
            session.setAttribute("loginUser", username);
            System.out.println("登录成功，设置session:" + session.getAttribute("loginUser"));
            return "success";
        } else {
            return "failed";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        System.out.println("登出");
        request.getSession().invalidate();
        return "redirect:/rabies/login.html";
    }
}
