package com.zym.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author zhouyumeng
 * @date 2021/12/20
 **/
@Data
@AllArgsConstructor
@ToString
public class WuKong implements Cloneable{

    private String name;
    private Integer age;
    private String color;
    private BaJie baJie;

    @Override
    public WuKong clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (WuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
