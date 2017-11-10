package me.feathers.sell.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 卖家信息
 * 动态更新,如果只需要修改username字段,sql语句中则只会有username字段
 * <p>
 * @author Feather
 * @date 2017-11-09 18:25
 */
@Entity
@Data
@DynamicUpdate
public class SellerInfo {

    /**
     * id
     */
    @Id
    private String id;

    /**
     * 卖家用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
