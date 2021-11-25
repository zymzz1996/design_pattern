package com.zym.principle.single_responsibility;

/**
 * 单一职责原则
 * @author zhouyumeng
 * @date 2021/11/24
 **/
public class SingleResponsibility {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }

    static class RoadVehicle{

        public void run(String name) {
            System.out.println(name + "在公路上跑!");
        }
    }

    static class WaterVehicle{

        public void run(String name) {
            System.out.println(name + "在水中跑!");
        }
    }

    static class AirVehicle{

        public void run(String name) {
            System.out.println(name + "在空中跑!");
        }
    }

}
