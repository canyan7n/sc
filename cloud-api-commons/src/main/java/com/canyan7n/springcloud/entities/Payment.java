package com.canyan7n.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Payment
 * @date ：2023/5/20 16:13
 * @description：TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Integer id;
    private String serial;
}
