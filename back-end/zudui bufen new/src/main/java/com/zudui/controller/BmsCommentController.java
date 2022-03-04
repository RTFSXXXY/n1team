package com.zudui.controller;

import com.zudui.common.api.ApiResult;
import com.zudui.model.dto.CommentDTO;
import com.zudui.model.entity.BmsComment;
import com.zudui.model.entity.UmsUser;
import com.zudui.model.vo.CommentVO;
import com.zudui.service.IBmsCommentService;
import com.zudui.service.IUmsUserService;
import com.zudui.jwt.JwtUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/comment")
public class BmsCommentController extends BaseController {

    @Resource
    private IBmsCommentService bmsCommentService;
    @Resource
    private IUmsUserService umsUserService;

    /**
     * 获取评论
     * @param topicid 话题id
     * @return 评论列表
     */
    @GetMapping("/get_comments")
    public ApiResult<List<CommentVO>> getCommentsByTopicID(@RequestParam(value = "topicid", defaultValue = "1") String topicid) {
        List<CommentVO> lstBmsComment = bmsCommentService.getCommentsByTopicID(topicid);
        return ApiResult.success(lstBmsComment);
    }

    /**
     * 添加评论
     * @param userName 用户名
     * @param dto 评论
     * @return 评论内容
     */
    @PostMapping("/add_comment")
    public ApiResult<BmsComment> add_comment(@RequestHeader(value = JwtUtil.USER_NAME) String userName,
                                             @RequestBody CommentDTO dto) {
        UmsUser user = umsUserService.getUserByUsername(userName);
        BmsComment comment = bmsCommentService.create(dto, user);
        return ApiResult.success(comment);
    }

}
