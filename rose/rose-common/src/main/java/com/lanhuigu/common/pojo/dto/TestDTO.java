package com.lanhuigu.common.pojo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 参数传递对象DTO
 *
 * @author yihonglei
 * @date 2019/10/12 3:18 PM
 */
@Data
public class TestDTO {
    @NotBlank(message = "id不能为空")
    private Integer id;
}