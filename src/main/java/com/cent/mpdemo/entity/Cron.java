package com.cent.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author cui
 * @since 2020-09-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Cron对象", description="")
public class Cron implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "定时任务id")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "定时任务cron表达式")
    private String cron;


}
