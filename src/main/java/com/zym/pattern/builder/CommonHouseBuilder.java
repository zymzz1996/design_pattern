package com.zym.pattern.builder;

/**
 * @author zhouyumeng
 * @date 2021/12/29
 **/
public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBasic("普通地基");
    }

    @Override
    public void buildWall() {
        house.setWall("普通外墙");
    }

    @Override
    public void roofed() {
        house.setRoof("普通房顶");
    }
}
