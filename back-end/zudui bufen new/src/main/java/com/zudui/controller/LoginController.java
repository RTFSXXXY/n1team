package com.zudui.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zudui.model.dto.LoginDTO;
import com.zudui.model.entity.UmsUser;
import com.zudui.model.vo.ProfileVO;
import com.zudui.service.IUmsUserService;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class LoginController {
    @Resource
    IUmsUserService umsUserService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model){
        LoginDTO loginDTO =LoginDTO.builder()
                .username(username)
                .password(password)
                .build();
        String s = umsUserService.executeLogin(loginDTO);
        //UmsUser userByUsername = umsUserService.getUserByUsername(username);
        ProfileVO loginProfile = umsUserService.getUserProfile(umsUserService.getUserByUsername(username).getId());
        if (s != null){
            session.setAttribute("loginUser",loginProfile);
            return "redirect:/main";
        }else {
            model.addAttribute("msg","密码错误，请重新登录！");
            return "login";
        }
    }

    /**
     * 忘记密码
     */
    @GetMapping("/forget")
    public String forgetLogin(){
        return "forget";
    }
    /**
     * 注册
     */
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
