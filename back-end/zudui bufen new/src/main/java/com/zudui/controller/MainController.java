package com.zudui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    /**
     * 主界面话题列表
     */
    @GetMapping("/main")
    public String index(){
        return "main";
    }

    /**
     * 跳转”我的发布“界面
     */
    @GetMapping("/myTopic")
    public String myTopic(){
        return "myTopic";
    }

    /**
     * 跳转”我的消息“界面
     */
    @GetMapping("/myMessage")
    public String myMessage(){
        return "myMessage";
    }

    /**
     * 跳转”我的参与“界面
     */
    @GetMapping("/myParticipation")
    public String myParticipation(){
        return "myParticipation";
    }

    /**
     * 跳转”信息与设置“界面
     */
    @GetMapping("/information")
    public String information(){
        return "information";
    }
}
