package com.zudui.controller;

import com.zudui.common.api.ApiResult;
import com.zudui.model.dto.CreateTopicDTO;
import com.zudui.model.entity.BmsPost;
import com.zudui.service.IUmsUserService;
import com.zudui.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TopicController {

    @Resource
    TopicService topicService;

    @Resource
    IUmsUserService umsUserService;

    /**
     * 新建话题
     */
    @PostMapping("/createTopic")
    public ApiResult<BmsPost> createTopic(@RequestParam("title") String title,
                                          @RequestParam("content") String content,
                                          @RequestParam("tags") List<String> tags,
                                          Model model){
        CreateTopicDTO build = CreateTopicDTO.builder()
                .title(title)
                .content(content)
                .tags(tags)
                .build();
        BmsPost topic = topicService.createTopic(build);
        model.addAttribute("msg","成功创建话题"+title);
        return ApiResult.success(topic);
    }

    /**
     * 编辑话题
     */
    @PostMapping("/modifyTopic")
    public String modifyTopic(@RequestParam("title") String title,
                              @RequestParam("content") String content,
                              @RequestParam("tags") List<String> tags,
                              Model model){


        return "";
    }

    /**
     * 删除话题
     */
    @PostMapping("/deleteTopic")
    public ApiResult<BmsPost> deleteTopic(@RequestParam("id") String id,
                                          Model model){
        BmsPost bmsPost = topicService.deletePost(id);
        model.addAttribute("msg","成功删除话题"+topicService.selectTopicById(id).getTitle());

        return ApiResult.success(bmsPost);
    }

    /**
     * 关注话题
     */
    @PostMapping("/followTopic")
    public ApiResult<BmsPost> followTopic(@RequestParam("topicId") String topicId,
                                          @RequestParam("userName") String userName,
                                          Model model){
        BmsPost bmsPost = topicService.followTopic(topicId, userName);
        model.addAttribute("msg",userName + "已成功关注文章：" + topicService.selectTopicById(topicId).getTitle());
        return ApiResult.success(bmsPost);
    }

    /**
     * 申请加入
     */
    public String joinTopic(){

        return "";
    }

    /**
     * 申请退出
     */
    public String withdrawTopic(){

        return "";
    }
}
