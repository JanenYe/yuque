package com.bkood.yuque.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 仓库信息
 * <a href="https://www.yuque.com/yuque/developer/bookserializer">BookSerializer</a>
 */
@Data
public class Book {

    /**
     * 仓库编号
     */
    Long id;

    /**
     * 类型
     * <li>Book - 文档</li>
     */
    String type;

    /**
     * 仓库路径
     */
    String slug;

    /**
     * 名称
     */
    String name;

    /**
     * 仓库完整路径
     */
    String namespace;

    /**
     * 所属的团队/用户编号
     */
    Long userId;

    /**
     * 用户信息
     */
    User user;

    /**
     * 介绍
     */
    String description;

    /**
     * 创建人 User Id
     */
    Long creatorId;

    /**
     * 公开状态<br/>
     * 因为public是java的保留字段，所以起了别名publicType<br/>
     * public => publicType
     * <li>1 - 公开</li>
     * <li>0 - 私密</li>
     */
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    Integer publicType;

    /**
     * 喜欢数量
     */
    Integer likesCount;

    /**
     * 订阅数量
     */
    Integer watchesCount;

    /**
     * 创建时间
     */
    Date createdAt;

    /**
     * 更新时间
     */
    Date updatedAt;

    public Integer getPublic() {
        return publicType;
    }

    public void setPublic(Integer publicType) {
        this.publicType = publicType;
    }
}
