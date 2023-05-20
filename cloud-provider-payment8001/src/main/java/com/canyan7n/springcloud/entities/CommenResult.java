package com.canyan7n.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :CommenResult
 * @date ：2023/5/20 16:20
 * @description：TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommenResult<T> {
    private Integer code;
    private String message;
    private T data;
    CommenResult(Integer code,String message){
        this(code, message,null);
    }
}
