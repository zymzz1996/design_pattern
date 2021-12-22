package com.zym.pattern.prototype.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhouyumeng
 * @date 2021/12/21
 **/
@Data
@AllArgsConstructor
@ToString
public class Wheel implements Cloneable, Serializable {

    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
