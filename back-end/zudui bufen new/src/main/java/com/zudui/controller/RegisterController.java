package com.zudui.controller;

import com.zudui.model.dto.RegisterDTO;
import com.zudui.model.entity.UmsUser;
import com.zudui.service.IUmsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class RegisterController {

    @Resource
    IUmsUserService umsUserService;

    @PostMapping("/register")
    public String register(@RequestParam("name") String name,
                           @RequestParam("pass") String pass,
                           @RequestParam("checkPass") String checkPass,
                           HttpSession session){
        RegisterDTO registerDTO = RegisterDTO.builder()
                .name(name)
                .pass(pass)
                .checkPass(checkPass)
                .build();
        UmsUser newUser = umsUserService.executeRegister(registerDTO);
        session.setAttribute("loginUser",newUser);
        return "redirect:/main";
    }
}
