package com.zym.pattern.builder;

/**
 * @author zhouyumeng
 * @date 2021/12/29
 **/
public class HighBuildingBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBasic("高层地基");
    }

    @Override
    public void buildWall() {
        house.setWall("高层外墙");
    }

    @Override
    public void roofed() {
        house.setRoof("高层房顶");
    }
}
