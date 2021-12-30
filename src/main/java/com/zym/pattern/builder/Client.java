package com.zym.pattern.builder;

/**
 * @author zhouyumeng
 * @date 2021/12/29
 **/
public class Client {

    public static void main(String[] args) {
        //HouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseBuilder houseBuilder = new HighBuildingBuilder();
        HouseDirector houseDirector = new HouseDirector();
        House house = houseDirector.construct(houseBuilder);
        System.out.println(house);
    }

}
