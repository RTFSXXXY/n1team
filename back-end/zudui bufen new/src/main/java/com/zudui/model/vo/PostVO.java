package com.zudui.model.vo;

import com.zudui.model.entity.BmsTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostVO implements Serializable {
    private static final long serialVersionUID = -261082150965211545L;

    /**
     * 文章ID
     */
    private String id;
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 账号
     */
    private String username;
    /**
     * 标题
     */
    private String title;
    /**
     * 评论统计
     */
    private Integer comments;
    /**
     * 置顶
     */
    private Boolean top;
    /**
     * 关注
     */
    private Boolean essence;
    /**
     * 话题关联标签
     */
    private List<BmsTag> tags;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
}
