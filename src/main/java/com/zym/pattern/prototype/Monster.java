package com.zym.pattern.prototype;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Scope;

/**
 * @author zhouyumeng
 * @date 2021/12/20
 **/
@Data
@ToString
public class Monster {

    private Long id = 11L;
    private String name = "恐怖怪人";

}
