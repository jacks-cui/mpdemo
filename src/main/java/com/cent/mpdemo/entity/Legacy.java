package com.cent.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 布达拉宫遗产清单
 * </p>
 *
 * @author cui
 * @since 2020-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_legacy")
@ApiModel(value="Legacy对象", description="布达拉宫遗产清单")
public class Legacy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "遗产名称")
    private String legacyName;

    @ApiModelProperty(value = "组成部分")
    private String legacyComponent;

    @ApiModelProperty(value = "遗产要素")
    private String legacyPrimary;

    @ApiModelProperty(value = "遗产类型")
    private String legacyKind;

    @ApiModelProperty(value = "遗产规模")
    private String legacyScope;

    @ApiModelProperty(value = "经度")
    private Double longitude;

    @ApiModelProperty(value = "纬度")
    private Double latitude;


}
