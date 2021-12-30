package com.zym.pattern.builder;

/**
 * @author zhouyumeng
 * @date 2021/12/29
 **/
public class HouseDirector {

    public House construct(HouseBuilder houseBuilder) {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.house;
    }

}
