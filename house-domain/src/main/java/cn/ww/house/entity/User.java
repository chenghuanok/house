package cn.ww.house.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 * @Author: chenghuan
 * @Date: 2019/9/9 21:39
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class User implements Serializable {

    /**
     * 主键GID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 姓名
     */
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    /**
     * 手机号
     */
    @Column(name = "phone", nullable = false, length = 13)
    private String phone;

    /**
     * 邮箱
     */
    @Column(name = "email", nullable = false, length = 90)
    private String email;

    /**
     * 自我介绍
     */
    @Column(name = "about_me", nullable = false, length = 250)
    private String aboutMe;

    /**
     * 密码
     */
    @Column(name = "pass_wd", nullable = false, length = 512)
    private String passWd;

    /**
     * 头像图片
     */
    @Column(name = "avatar", nullable = false, length = 512)
    private String avatar;

    /**
     * 用户类型 （1:普通用户，2:房产经纪人）
    */
    @Column(name = "type", nullable = false)
    private Integer type;

    /**
     * 创建时间
     */
    @Column(name = "create_time",nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time",nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updateTime;

    /**
     * 是否启用,1启用，0停用
     */
    @Column(name = "enable", nullable = false)
    private Integer enable;

    /**
     *所属经纪机构
     */
    @Column(name = "agency_id", nullable = false)
    private Long agencyId;
}
