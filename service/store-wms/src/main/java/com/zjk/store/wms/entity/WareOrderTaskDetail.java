package com.zjk.store.wms.entity;

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
 * 库存工作单
 * </p>
 *
 * @author zjk
 * @since 2022-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wms_ware_order_task_detail")
@ApiModel(value="WareOrderTaskDetail对象", description="库存工作单")
public class WareOrderTaskDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "sku_id")
    private Long skuId;

    @ApiModelProperty(value = "sku_name")
    private String skuName;

    @ApiModelProperty(value = "购买个数")
    private Integer skuNum;

    @ApiModelProperty(value = "工作单id")
    private Long taskId;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    @ApiModelProperty(value = "1-已锁定  2-已解锁  3-扣减")
    private Integer lockStatus;


}
