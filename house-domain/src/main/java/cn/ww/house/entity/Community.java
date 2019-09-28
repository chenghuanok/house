package cn.ww.house.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 小区实体
 * @Author: chenghuan
 * @Date: 2019/9/28 21:02
 */
@Entity
@Table(name = "community")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class Community implements Serializable {

    /**
     * 主键GID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 城市编码
     */
    @Column(name = "city_code", nullable = false, length = 11)
    private String cityCode;

    /**
     * 小区名称
     */
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    /**
     * 城市名称
     */
    @Column(name = "city_name", nullable = false, length = 11)
    private String cityName;
}
