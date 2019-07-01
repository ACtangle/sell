package com.melon.sell.pojo;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * ClassName ProductCategory
 * Description TODO
 * Author melon
 * Date 2019-07-01 15:30
 * Version
 */

@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     *  类目id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     *  类目名称
     */
    private String categoryName;

    /**
     *   类目编号
     *
     */
    private Integer categoryType;

    public ProductCategory(){}
}
