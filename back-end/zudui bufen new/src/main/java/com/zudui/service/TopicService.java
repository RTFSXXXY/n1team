package com.zudui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zudui.model.dto.CreateTopicDTO;
import com.zudui.model.entity.BmsPost;

public interface TopicService extends IService<BmsPost> {

    /**
     * 新建话题
     */
    BmsPost createTopic(CreateTopicDTO createTopicDTO);

    /**
     * 删除话题
     */
    BmsPost deletePost(String id);

    /**
     * 通过id获取对应话题
     */
    BmsPost selectTopicById(String id);

    /**
     * 关注话题
     */
    BmsPost followTopic(String topicId, String userName);

}
