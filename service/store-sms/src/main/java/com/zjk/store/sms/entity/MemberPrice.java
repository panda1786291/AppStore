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
 * 商品会员价格
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sms_member_price")
@ApiModel(value="MemberPrice对象", description="商品会员价格")
public class MemberPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "sku_id")
    private Long skuId;

    @ApiModelProperty(value = "会员等级id")
    private Long memberLevelId;

    @ApiModelProperty(value = "会员等级名")
    private String memberLevelName;

    @ApiModelProperty(value = "会员对应价格")
    private BigDecimal memberPrice;

    @ApiModelProperty(value = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
    private Boolean addOther;


}
