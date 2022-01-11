package com.zjk.store.sms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品阶梯价格
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sms_sku_ladder")
@ApiModel(value="SkuLadder对象", description="商品阶梯价格")
public class SkuLadder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "spu_id")
    private Long skuId;

    @ApiModelProperty(value = "满几件")
    private Integer fullCount;

    @ApiModelProperty(value = "打几折")
    private BigDecimal discount;

    @ApiModelProperty(value = "折后价")
    private BigDecimal price;

    @ApiModelProperty(value = "是否叠加其他优惠[0-不可叠加，1-可叠加]")
    private Boolean addOther;


}
