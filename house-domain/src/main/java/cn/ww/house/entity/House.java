package cn.ww.house.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 房屋实体
 * @Author: chenghuan
 * @Date: 2019/9/28 21:13
 */
@Entity
@Table(name = "house")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class House implements Serializable {

    /**
     * 主键GID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 房产名称
     */
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    /**
     * 1:销售，2:出租
     */
    @Column(name = "type", nullable = false)
    private int type;

    /**
     * 单位元
     */
    @Column(name = "price", nullable = false)
    private int price;

    /**
     * 图片地址
     */
    @Column(name = "images", nullable = false, length = 1024)
    private String images;

    /**
     * 面积
     */
    @Column(name = "area", nullable = false)
    private int area;

    /**
     * 卧室数量
     */
    @Column(name = "area", nullable = false)
    private int beds;

    /**
     * 卫生间数量
     */
    @Column(name = "baths", nullable = false)
    private int baths;

    /**
     * 评级
     */
    @Column(name = "rating", nullable = false)
    private Double rating;

    /**
     * 房产描述
     */
    @Column(name = "remarks", nullable = false, length = 512)
    private String remarks;

    /**
     * 属性
     */
    @Column(name = "properties", nullable = false, length = 512)
    private String properties;

    /**
     * 户型图
     */
    @Column(name = "properties", nullable = false, length = 250)
    private String floorPlan;

    /**
     * 标签
     */
    @Column(name = "tags", nullable = false, length = 20)
    private String tags;

    /**
     * 创建时间
     */
    @Column(name = "create_time",nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createTime;

    /**
     * 城市ID
     */
    @Column(name = "city_id", nullable = false)
    private int cityId;

    /**
     * 小区ID
     */
    @Column(name = "community_id", nullable = false)
    private int community_id;

    /**
     * 房产地址
     */
    @Column(name = "address", nullable = false, length = 20)
    private String address;

    /**
     * 1-上架，2-下架'
     */
    @Column(name = "state", nullable = false)
    private int state;
}
