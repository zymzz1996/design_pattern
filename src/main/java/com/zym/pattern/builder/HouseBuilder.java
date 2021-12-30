package com.zym.pattern.builder;

/**
 * @author zhouyumeng
 * @date 2021/12/29
 **/
public abstract class HouseBuilder {

    House house = new House();

    abstract void buildBasic();
    abstract void buildWall();
    abstract void roofed();

}
