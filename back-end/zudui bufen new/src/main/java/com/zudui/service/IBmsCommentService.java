package com.zudui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zudui.model.dto.CommentDTO;
import com.zudui.model.entity.BmsComment;
import com.zudui.model.entity.UmsUser;
import com.zudui.model.vo.CommentVO;

import java.util.List;


public interface IBmsCommentService extends IService<BmsComment> {
    /**
     *
     *
     * @param topicid
     * @return {@link BmsComment}
     */
    List<CommentVO> getCommentsByTopicID(String topicid);

    BmsComment create(CommentDTO dto, UmsUser principal);
}
