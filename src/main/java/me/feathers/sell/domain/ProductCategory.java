package me.feathers.sell.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 实体类 产品类别
 * <p>
 *
 * @author Feathers
 * @date 2017-11-06 10:04
 */
@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名称.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;
}
